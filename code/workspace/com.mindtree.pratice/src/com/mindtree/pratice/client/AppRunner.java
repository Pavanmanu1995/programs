package com.mindtree.pratice.client;

import com.mindtree.pratice.service.Employee;
import com.mindtree.pratice.service.EmployeeImpl;

public class AppRunner {

	public static void main(String[] args) {
		Employee emp=new EmployeeImpl();
		emp.employeeDetails();
		

	}

}
