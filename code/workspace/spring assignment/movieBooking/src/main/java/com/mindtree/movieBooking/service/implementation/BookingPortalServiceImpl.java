package com.mindtree.movieBooking.service.implementation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.movieBooking.entity.BookingPortal;
import com.mindtree.movieBooking.entity.MovieTicket;
import com.mindtree.movieBooking.exception.MovieBookingServiceException;
import com.mindtree.movieBooking.exception.custom.BookingPortalNotExistsException;
import com.mindtree.movieBooking.exception.custom.BookingPortalNotFoundException;
import com.mindtree.movieBooking.exception.custom.BookingPortalalreadyExistsException;
import com.mindtree.movieBooking.exception.custom.NoMovieTicketBookedException;
import com.mindtree.movieBooking.funcInterface.FuncInterface;
import com.mindtree.movieBooking.repository.BookingPortalRepository;
import com.mindtree.movieBooking.repository.MovieTicketRepository;
import com.mindtree.movieBooking.service.BookingPortalService;

@Service
public class BookingPortalServiceImpl implements BookingPortalService {

	@Autowired
	private BookingPortalRepository bookingPortalRepository;

	@Autowired
	private MovieTicketRepository movieTicketRepository;

	@Override
	public BookingPortal addBookingPortalData(BookingPortal bookingPortal) throws MovieBookingServiceException {
		FuncInterface obj = () -> {

			if (bookingPortalRepository.findByPortalName(bookingPortal.getPortalName()).isPresent())
				throw new BookingPortalalreadyExistsException("Booking Portal Is Already Exists. ");

			bookingPortalRepository.save(bookingPortal);
			return bookingPortal;
		};
		return obj.function();
	}

	@Override
	public List<BookingPortal> getBookingPortalData() throws MovieBookingServiceException {
		List<BookingPortal> bookingPortalList = bookingPortalRepository.findAll();

//		if (bookingPortalList.isEmpty())
//			throw new BookingPortalNotFoundException("Booking portal is empty");
		bookingPortalList.stream().findAny()
				.orElseThrow(() -> new BookingPortalNotFoundException("Booking portal is empty"));

		bookingPortalList.forEach(bookingPortal1 -> {
			List<MovieTicket> movieTicketList = bookingPortal1.getMovieTicket();

			Collections.sort(movieTicketList, new Comparator<MovieTicket>() {
				public int compare(MovieTicket m1, MovieTicket m2) {
					return -Double.compare(m1.getTicketPrice(), m2.getTicketPrice());
				}
			});
		});

		return bookingPortalList;

	}

	@Override
	public void deleteBookingPorttalData(String portalName) throws MovieBookingServiceException {
		BookingPortal bookingPortal = bookingPortalRepository.findByPortalName(portalName)
				.orElseThrow(() -> new BookingPortalNotExistsException("Booking Portal Is Not Exists. "));

		List<MovieTicket> movieTicketList = bookingPortal.getMovieTicket();

//		if (movieTicketList.isEmpty())
//			throw new NoMovieTicketBookedException("No Movie ticket is booked.");
		movieTicketList.stream().findAny()
				.orElseThrow(() -> new NoMovieTicketBookedException("No Movie ticket is booked."));

		movieTicketList.forEach(movieTicket -> movieTicket.setBookingPortal(null));

//		for (MovieTicket movieTicket : movieTicketList) {
//			movieTicket.setBookingPortal(null);
//		}

		movieTicketRepository.saveAll(movieTicketList);
		bookingPortalRepository.delete(bookingPortal);

	}

	@Override
	public Set<BookingPortal> getBookingPortalDetails() throws MovieBookingServiceException {
		Set<BookingPortal> bookingPortal = new HashSet<BookingPortal>();
		try {
			bookingPortal = this.bookingPortalRepository.findAll().stream().collect(Collectors.toSet());
			FileOutputStream fout = new FileOutputStream("D:\\file4.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream out = new ObjectOutputStream(bout);

			out.writeObject(bookingPortal);
			out.flush();
			out.close();
		} catch (Exception e) {
			throw new MovieBookingServiceException(e);
		}

		return bookingPortal;
	}

	@Override
	public Set<BookingPortal> getBookingPortalDetail() throws MovieBookingServiceException {
		Set<BookingPortal> bookingPortal = new HashSet<BookingPortal>();
		try {
			FileInputStream fout = new FileInputStream("D:\\file4.txt");
			BufferedInputStream bis = new BufferedInputStream(fout);
			ObjectInputStream in = new ObjectInputStream(fout);
			bookingPortal = (Set<BookingPortal>) in.readObject();
			System.out.println(bookingPortal);
			in.close();
		} catch (Exception e) {
			throw new MovieBookingServiceException(e);
		}
		return bookingPortal;
	}
}