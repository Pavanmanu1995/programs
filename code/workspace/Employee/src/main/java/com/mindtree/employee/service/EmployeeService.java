package com.mindtree.employee.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.service.EmployeeServiceException;

@Service
public interface EmployeeService {

	public Employee addEmployeeDetails(Employee employee) throws EmployeeServiceException;

	public Set<Employee> getEmployeeDetails() throws EmployeeServiceException;

	public Employee getEmployeeDetailsById(int id) throws EmployeeServiceException;

	public void writingIntoExcel() throws EmployeeServiceException;

	public List<String> readingFromExcel() throws EmployeeServiceException;

}
