package com.example.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Set<Employee> getAllEmployee() {
		List<Employee> employees = this.employeeRepo.findAll();

		Set<Employee> employeesSet = new HashSet<>(employees);
		return employeesSet;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee savedEmployee = this.employeeRepo.save(employee);

		return savedEmployee;
	}

}
