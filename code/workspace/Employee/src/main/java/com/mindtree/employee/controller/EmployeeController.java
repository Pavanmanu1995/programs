package com.mindtree.employee.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employee.dto.EmployeeDTO;
import com.mindtree.employee.dto.ResponseBody;
import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.EmployeeAppException;
import com.mindtree.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/addemployeedetails")
	public ResponseEntity<?> addEmployeeDetails(@Valid @RequestBody EmployeeDTO employee) throws EmployeeAppException {
		return new ResponseEntity<ResponseBody<EmployeeDTO>>(new ResponseBody<EmployeeDTO>(modelMapper
				.map(employeeService.addEmployeeDetails(modelMapper.map(employee, Employee.class)), EmployeeDTO.class),
				null, "employee details added successfully", true), HttpStatus.OK);
	}

	@GetMapping("/employeedetails")
	public ResponseEntity<?> getEmployeeDetails() throws EmployeeAppException {
		return new ResponseEntity<ResponseBody<Set<EmployeeDTO>>>(new ResponseBody<Set<EmployeeDTO>>(
				modelMapper.map(employeeService.getEmployeeDetails(), new TypeToken<Set<EmployeeDTO>>() {
				}.getType()), null, "employee details found successfully", true), HttpStatus.OK);
	}

	@GetMapping("/employeedetails/{id}")
	public ResponseEntity<?> getEmployeeDetailsById(@PathVariable int id) throws EmployeeAppException {
		return new ResponseEntity<ResponseBody<EmployeeDTO>>(new ResponseBody<EmployeeDTO>(
				modelMapper.map(employeeService.getEmployeeDetailsById(id), EmployeeDTO.class), null,
				"employee details found successfully", true), HttpStatus.OK);
	}

	@GetMapping("/writingintoexcel")
	public ResponseEntity<?> writingIntoExcel() throws EmployeeAppException {
		employeeService.writingIntoExcel();
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "writing into excel done successfully", true), HttpStatus.OK);
	}

	@GetMapping("/readingfromexcel")
	public ResponseEntity<?> readingFromExcel() throws EmployeeAppException {

		return new ResponseEntity<ResponseBody<List<String>>>(new ResponseBody<List<String>>(
				employeeService.readingFromExcel(), null, "reading from excel done successfully", true), HttpStatus.OK);
	}

}
