package com.mindtree.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.EmployeeAlreadyPresentException;
import com.mindtree.employee.exception.EmployeeServiceException;

public class EmployeeServiceImplementation implements IEmployeeService {
	static List<Employee> list=new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee emp) throws EmployeeServiceException {
		try {
			for (Employee e : list) {
				if(e.getName().equalsIgnoreCase(emp.getName())) {
					throw new EmployeeAlreadyPresentException("Employee already exist");
				}
			}
			}catch(EmployeeServiceException e) {
				throw new EmployeeServiceException(e.getMessage());
			}
			list.add(emp);
			return "Added successfully";
		}
	}

