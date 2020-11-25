package com.example.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.dto.EmployeeDTO;
import com.example.employee.entity.Employee;
import com.example.employee.exception.service.EmployeeServiceException;

@Service
public interface EmployeeService {

	public List<Employee> addEmployeeDetails(List<EmployeeDTO> employeeDTO) throws EmployeeServiceException;

	public double totalSalary() throws EmployeeServiceException;

	public List<Employee> seniorEnginner() throws EmployeeServiceException;

	public int noOfEnginner() throws EmployeeServiceException;

	

}
