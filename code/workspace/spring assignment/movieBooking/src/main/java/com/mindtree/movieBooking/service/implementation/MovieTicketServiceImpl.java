package com.mindtree.movieBooking.service.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBooking.entity.BookingPortal;
import com.mindtree.movieBooking.entity.MovieTicket;
import com.mindtree.movieBooking.exception.MovieBookingServiceException;
import com.mindtree.movieBooking.exception.custom.BookingPortalNotFoundException;
import com.mindtree.movieBooking.exception.custom.MovieTicketAlreadyBookedException;
import com.mindtree.movieBooking.exception.custom.MovieNotFoundException;
import com.mindtree.movieBooking.repository.BookingPortalRepository;
import com.mindtree.movieBooking.repository.MovieTicketRepository;
import com.mindtree.movieBooking.service.MovieTicketService;

@Service
public class MovieTicketServiceImpl implements MovieTicketService {
	
	@Autowired
	private MovieTicketRepository movieTicketRepository;

	@Autowired
	private BookingPortalRepository bookingPortalRepository;

	@Override
	public MovieTicket addMovieTicketData(MovieTicket movieTicketObj, String portalName)
			throws MovieBookingServiceException {

		BookingPortal bookingPortal = bookingPortalRepository.findByPortalName(portalName)
				.orElseThrow(() -> new BookingPortalNotFoundException("Booking Portal Not Found"));

		for (MovieTicket movieTicket2 : bookingPortal.getMovieTicket()) {
			if (movieTicket2.getMovieName().equalsIgnoreCase(movieTicketObj.getMovieName()))
				throw new MovieTicketAlreadyBookedException("Movie Ticket Is Already Booked");
		}
		bookingPortal.getMovieTicket().add(movieTicketObj);
		movieTicketObj.setBookingPortal(bookingPortal);
		movieTicketRepository.save(movieTicketObj);
		return movieTicketRepository.findByMovieName(movieTicketObj.getMovieName()).get();

	}

	@Override
	public void deleteMovieData(String movieName) throws MovieBookingServiceException {

		MovieTicket movieTicket = movieTicketRepository.findByMovieName(movieName)
		.orElseThrow(() -> new MovieNotFoundException("Movie Not Found."));

		movieTicketRepository.delete(movieTicket);

	}

	@Override
	public void writingIntoExcel() throws MovieBookingServiceException {
		Map<MovieTicket,BookingPortal> map =new TreeMap<MovieTicket,BookingPortal>();
		try {
			movieTicketRepository.findAll().forEach(r -> {
				
				MovieTicket movieTicket=new MovieTicket(r.getMovieTicketId(),r.getMovieName(),r.getTicketPrice());
				BookingPortal bookingPortal= new BookingPortal(r.getBookingPortal().getPorttalId(),r.getBookingPortal().getPortalName());
				map.put(movieTicket,bookingPortal);
			});
			
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("movie ticket data");
			
			Row row;
			row = sheet.createRow(0);
			Cell cell1 = row.createCell(0);
			cell1.setCellValue("MovieTicket_Id");
			Cell cell2 = row.createCell(1);
			cell2.setCellValue("Movie_Name");
			Cell cell3 = row.createCell(2);
			cell3.setCellValue("TicketPrice");
			Cell cell4 = row.createCell(3);
			cell4.setCellValue("BookingPortal_Id");
			Cell cell5 = row.createCell(4);
			cell5.setCellValue("BookingPortal_Name");

			int rownum = 1;

			for (Map.Entry<MovieTicket,BookingPortal> mapdata : map.entrySet()) {

				row = sheet.createRow(rownum++);
				Cell cell01 = row.createCell(0);
				cell01.setCellValue(mapdata.getKey().getMovieTicketId());

				Cell cell02 = row.createCell(1);
				cell02.setCellValue(mapdata.getKey().getMovieName());

				Cell cell03 = row.createCell(2);
				cell03.setCellValue(mapdata.getKey().getTicketPrice());

				Cell cell04 = row.createCell(3);
				cell04.setCellValue(mapdata.getValue().getPorttalId());

				Cell cell05 = row.createCell(4);
				cell05.setCellValue(mapdata.getValue().getPortalName());
			}

			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					"C:\\Users\\M1057704\\Documents\\movieticket\\readandwrite.xlsx"));
			workbook.write(fileOutputStream);

			fileOutputStream.close();
			workbook.close();
			
			
		} catch (Exception e) {
			throw new MovieBookingServiceException(e.getMessage());
		}
		
	}

	@Override
	public List<String> readingFromExcel() throws MovieBookingServiceException {
		try {

			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\M1057704\\Documents\\movieticket\\readandwrite.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheet("movie ticket data");
			List<String> rowdata = new ArrayList<String>();

			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.iterator();

				List<String> celldata = new ArrayList<String>();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					String s1 = cell.toString() + "    ";
					celldata.add(s1);

				}
				String s = celldata + "";
				rowdata.add(s);
			}

			workbook.close();
			fileInputStream.close();
			return rowdata;

		} catch (IOException e) {
			throw new MovieBookingServiceException(e.getMessage());
		}
	}
	}
