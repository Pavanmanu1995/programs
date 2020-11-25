package service;

import entity.Employee;

public class EmployeeImpl implements IEmployee {

	@Override
	public Employee getEmployee() {
		System.out.println("get employeee");
		return null;
	}

	@Override
	public Employee addEmployee() {
		System.out.println("add employees");
		return null;
	}

	@Override
	public void deleteEmployee() {
		System.out.println("delete employees");
		
	}

}
