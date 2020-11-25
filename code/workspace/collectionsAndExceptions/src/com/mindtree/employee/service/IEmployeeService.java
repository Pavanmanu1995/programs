package com.mindtree.employee.service;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.EmployeeServiceException;

public interface IEmployeeService {
	public String addEmployee(Employee emp) throws EmployeeServiceException;

}
