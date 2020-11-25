package com.mindtree.collegeUniversities.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegeUniversities.entity.College;
import com.mindtree.collegeUniversities.entity.University;
import com.mindtree.collegeUniversities.exception.service.ServiceException;
import com.mindtree.collegeUniversities.exception.service.UniversityNotFoundException;
import com.mindtree.collegeUniversities.exception.service.custom.UniversityAlreadyExistsException;
import com.mindtree.collegeUniversities.funcInterface.FuncInterface;
import com.mindtree.collegeUniversities.repository.CollegeRepository;
import com.mindtree.collegeUniversities.repository.UniversityRepository;



@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@Autowired
	private UniversityRepository universityRepository;


	@Override
	public University addDataToUniversity(University university) throws ServiceException 
	{
		FuncInterface obj = () -> {
		if (universityRepository.findByUniversityName(university.getUniversityName()).isPresent())
			throw new UniversityAlreadyExistsException("University Already Exists.");

		universityRepository.save(university);
		return university;
//		return this.universityRepository.save(university);
	};
	return obj.function();
	}


	@Override
	public Object deleteUniversity(int universityId) throws ServiceException {
		University university=this.universityRepository.findById(universityId).orElse(null);
		Set<University> universityList=null;
		if(university!=null)
		{
			universityRepository.delete(university);
		}
		else
		{
			throw new UniversityNotFoundException("university not found");
		}
		return "deleted successfully";
	}


	@Override
	public List<University> getUniversityData() throws ServiceException {
		List<University> universitiesList = universityRepository.findAll();

		if (universitiesList.isEmpty()) {
			throw new UniversityNotFoundException("University not found");
		}

		universitiesList.forEach(university -> {
			Collections.sort(university.getCollegeList(), new Comparator<College>() {
				@Override
				public int compare(College c1, College c2) {
					return -Integer.compare(c1.getTotalStudents(), c2.getTotalStudents());
				}
			});
		});

		return universitiesList;
	}


	@Override
	public void writingInExcel() throws ServiceException {
		Map<College, University> map = new HashMap<College, University>();

		try {
			collegeRepository.findAll().forEach(r -> {
				College college = new College(r.getCollegeId(), r.getCollegeName(), r.getTotalStudents());
				University university = new University(r.getUniversity().getUniversityId(),
						r.getUniversity().getUniversityName(), r.getUniversity().getTotalColleges());
				map.put(college, university);
			});

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("College with University Details");

			Row row;
			row = sheet.createRow(0);
			Cell cell1 = row.createCell(0);
			cell1.setCellValue("CollegeId");
			Cell cell2 = row.createCell(1);
			cell2.setCellValue("CollegeName");
			Cell cell3 = row.createCell(2);
			cell3.setCellValue("TotalStudent");
			Cell cell4 = row.createCell(3);
			cell4.setCellValue("UniversityId");
			Cell cell5 = row.createCell(4);
			cell5.setCellValue("UniversityName");
			Cell cell6 = row.createCell(5);
			cell6.setCellValue("TotalCollege");

			int rownum = 1;

			for (Map.Entry<College, University> mapdata : map.entrySet()) {

				row = sheet.createRow(rownum++);
				Cell cell01 = row.createCell(0);
				cell01.setCellValue(mapdata.getKey().getCollegeId());

				Cell cell02 = row.createCell(1);
				cell02.setCellValue(mapdata.getKey().getCollegeName());

				Cell cell03 = row.createCell(2);
				cell03.setCellValue(mapdata.getKey().getTotalStudents());

				Cell cell04 = row.createCell(3);
				cell04.setCellValue(mapdata.getValue().getUniversityId());

				Cell cell05 = row.createCell(4);
				cell05.setCellValue(mapdata.getValue().getUniversityName());

				Cell cell06 = row.createCell(5);
				cell06.setCellValue(mapdata.getValue().getTotalColleges());
			}

			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					"C:\\Users\\M1057704\\Documents\\readandwriteexcel\\excel.xlsx"));
			workbook.write(fileOutputStream);

			fileOutputStream.close();
			workbook.close();

		} catch (IOException e) {

			throw new ServiceException(e.getMessage());

		}

		
	}


	@Override
	public List<String> readingFromExcel() throws ServiceException {
		try {

			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\M1057704\\Documents\\readandwriteexcel\\excel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheet("College with University Details");
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
			throw new ServiceException(e.getMessage());
		}
	}


	@Override
	public Set<University> getUniversityDetails() throws ServiceException {
		Set<University> university=new TreeSet<University>();
		try {
			university=this.universityRepository.findAll().stream().collect(Collectors.toSet());
			FileOutputStream fout=new FileOutputStream("D:\\college.txt");
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			ObjectOutputStream out=new ObjectOutputStream(bout);
			
			out.writeObject(university);
			out.flush();
			out.close();
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return university;
	}


	@Override
	public Set<University> getUniversityDetail() throws ServiceException {
		Set<University> university=new TreeSet<University>();
		try {
		FileInputStream fout=new FileInputStream("D:\\college.txt");
		BufferedInputStream bis=new BufferedInputStream(fout);
		ObjectInputStream in=new ObjectInputStream(fout);
		university = (Set<University>)in.readObject();
		System.out.println(university);
		in.close();
	}
		 catch (Exception e) {
				throw new ServiceException(e);
	}
		return university;
	}
	}
	

