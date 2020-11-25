package com.mindtree.employee.service.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.service.EmployeeServiceException;
import com.mindtree.employee.exception.service.custom.EmployeeAlreadyPresentException;
import com.mindtree.employee.exception.service.custom.EmployeeDetailsNotFoundException;
import com.mindtree.employee.exception.service.custom.EmployeeNotFoundException;
import com.mindtree.employee.repository.EmployeeRespository;
import com.mindtree.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRespository employeeRepository;

	@Override
	public Employee addEmployeeDetails(Employee employee) throws EmployeeServiceException {
		if (employeeRepository.findByName(employee.getName()).isPresent())
			throw new EmployeeAlreadyPresentException("employee already present");
		employeeRepository.save(employee);

		return employee;
	}

	@Override
	public Set<Employee> getEmployeeDetails() throws EmployeeServiceException {
		employeeRepository.findAll().stream().findAny()
				.orElseThrow(() -> new EmployeeDetailsNotFoundException("employee details not found"));
		return employeeRepository.findAll().stream().map(e -> e).collect(Collectors.toSet());
	}

	@Override
	public Employee getEmployeeDetailsById(int id) throws EmployeeServiceException {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("employee not found"));
		return employee;
	}

	@Override
	public void writingIntoExcel() throws EmployeeServiceException {
		List<Employee> employees = employeeRepository.findAll();

		try {

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Employee Details");

			Row row;
			row = sheet.createRow(0);
			Cell cell01 = row.createCell(0);
			cell01.setCellValue("serial no");
			Cell cell02 = row.createCell(1);
			cell02.setCellValue("Name");
			Cell cell03 = row.createCell(2);
			cell03.setCellValue("Salary");
			Cell cell04 = row.createCell(3);
			cell04.setCellValue("Mobile_Number");
			Cell cell05 = row.createCell(4);
			cell05.setCellValue("Designation");

			int rownum = 1;
			for (Employee employee2 : employees) {

				row = sheet.createRow(rownum++);
				Cell cell1 = row.createCell(0);
				cell1.setCellValue(employee2.getId());

				Cell cell2 = row.createCell(1);
				cell2.setCellValue(employee2.getName());

				Cell cell3 = row.createCell(2);
				cell3.setCellValue(employee2.getSalary());

				Cell cell4 = row.createCell(3);
				cell4.setCellValue(employee2.getMobileNumber());

				Cell cell5 = row.createCell(4);
				cell5.setCellValue(employee2.getDesignation());

			}

			FileOutputStream fileOutputStream = new FileOutputStream(
					new File("C:\\Users\\M1057704\\Documents\\employee\\readandwrite.xlsx"));
			workbook.write(fileOutputStream);

			fileOutputStream.close();
			workbook.close();

		} catch (Exception e) {

			throw new EmployeeServiceException(e.getMessage());

		}

	}

	@Override
	public List<String> readingFromExcel() throws EmployeeServiceException {
		try {

			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\M1057704\\Documents\\employee\\readandwrite.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheet("Employee Details");
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

		} catch (Exception e) {
			throw new EmployeeServiceException(e.getMessage());
		}
	}


}
