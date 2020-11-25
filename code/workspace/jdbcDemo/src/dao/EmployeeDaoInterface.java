package dao;

import java.util.List;

import entity.Employee;
import exception.ConnectionFailedException;
import exception.EmployeeDaoException;

public interface EmployeeDaoInterface {

	public void insertEmployeeToDB(Employee e) throws EmployeeDaoException ,ConnectionFailedException;

	List<Employee> getAllEmployeesFromDB();
	
	
}
