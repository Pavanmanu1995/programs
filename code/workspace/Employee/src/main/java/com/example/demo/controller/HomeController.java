package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/homEE")
	public String getHome() {
		return "Hello";
	}

	@GetMapping("/our/choice")
	public String getChoice() {
		System.out.println("Hello api is hitted");
		return "Welcome to Spring Framework";
	}

	@GetMapping("/get/all/employee")
	public Set<Employee> getEmployee() {

		Set<Employee> employees = this.employeeService.getAllEmployee();
		return employees;
	}

	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return this.employeeService.saveEmployee(employee);
	}

}
