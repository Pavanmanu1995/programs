package service;

import java.util.List;

import dao.EmployeeDao;
import entity.Employee;
import exception.EmployeeDaoException;
import exception.EmployeeServiceException;


public class EmployeeService implements EmployeeServiceInterface {
	
	// Create dao layer object which will be used to call dao methods
	EmployeeDao ed = new EmployeeDao();

	// method to pass employee object to dao layer
	@Override
	public void insertEmployee(Employee e) throws EmployeeServiceException {
		try {
			ed.insertEmployeeToDB(e);

		} catch (EmployeeDaoException ee) {
			throw new EmployeeServiceException("Something wrong in employee addition", ee);
		}
	}

	// method to get list of employee objects from dao layer
	@Override
	public List<Employee> getAllEmployees() {
		return ed.getAllEmployeesFromDB();
	}
}
