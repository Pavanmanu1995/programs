package service.serviceImpl;

import entity.Employee;
import exception.EmployeeServiceException;

public interface EmployeeService {
	public String addEmployee(Employee emp) throws EmployeeServiceException;
	
	
}