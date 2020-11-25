package service;

import java.util.List;

import entity.Employee;
import exception.EmployeeServiceException;

public interface EmployeeServiceInterface {

	
	public void insertEmployee(Employee e) throws EmployeeServiceException;
	
	public List<Employee> getAllEmployees();
}
