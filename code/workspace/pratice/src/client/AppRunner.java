package client;

import service.EmployeeImpl;
import service.IEmployee;

public class AppRunner {

	public static void main(String[] args) {
		IEmployee emp= new EmployeeImpl();
		emp.getEmplyee();
		emp.getPersonDetails();

	}

}
