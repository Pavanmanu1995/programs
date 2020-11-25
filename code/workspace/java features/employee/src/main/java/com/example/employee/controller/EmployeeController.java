package com.example.employee.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.dto.EmployeeDTO;
import com.example.employee.entity.Employee;
import com.example.employee.exception.EmployeeAppException;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

//	@Autowired
//	private ModelMapper modelMapper;

	@PostMapping("/addemployeedetails")
	public List<Employee> addEmployeeDetails(@RequestBody List<EmployeeDTO> employeeDTO) throws EmployeeAppException {
		return this.employeeService.addEmployeeDetails(employeeDTO);
	}

	@GetMapping("/totalsalary")
	public double totalSalary() throws EmployeeAppException {
		return this.employeeService.totalSalary();
	}

	@GetMapping("/seniorEnginner")
	public List<Employee> seniorEnginner() throws EmployeeAppException {
		return this.employeeService.seniorEnginner();

	}

	@GetMapping("/noofenginner")
	public int noOfEnginner() throws EmployeeAppException {
		return this.employeeService.noOfEnginner();
	}
}
