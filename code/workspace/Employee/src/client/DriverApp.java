package client;

import entity.Employee;
import service.EmployeeImpl;
import service.IEmployee;
import service.IPerson;
import service.PersonImpl;

public class DriverApp {
	
	public static void main(String[] args)
	{
		IEmployee iEmployee = new EmployeeImpl();
		IPerson iperson=new PersonImpl();
		
		iEmployee.getEmployee();
		
		iEmployee.addEmployee();
		
		iEmployee.deleteEmployee();
		
		iperson.addPerson();
		
		iperson.getPerson();
		iperson.deletePerson();
		
		Employee emp = new Employee(1, "css", 20, 201, "pavan", 45678);
		
		
		
		
		
	}

}
