package com.mindtree.employee.client;

import com.mindtree.employee.entity.Employee;
import com.mindtree.employee.exception.EmployeeServiceException;
import com.mindtree.employee.service.EmployeeServiceImplementation;
import com.mindtree.employee.service.IEmployeeService;
import com.mindtree.employee.utility.Initialize;

public class EmployeeApp {
	static Initialize in=new Initialize();

	public static void main(String[] args) {
		IEmployeeService service=new EmployeeServiceImplementation();
		boolean flag=true;
		do {
			System.out.println("1. Add employee");
			System.out.println("2. Update");
			System.out.println("3. Show all");
			System.out.println("4. Show by MID");
			System.out.println("5. Delete");
			System.out.print("Enter choice");
			int choice=in.setInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Mid");
				String mid=in.setString();
				System.out.println("Enter name");
				String name=in.setString();
				System.out.println("Enter salary");
				float salary=in.setFloat();
				System.out.println("Enter age");
				int age=in.setInt();
				Employee emp=new Employee(mid,name,salary,age);
				try {
					String msg=service.addEmployee(emp);
					System.out.println(msg);
				} catch (EmployeeServiceException e) {
					System.out.println(e.getMessage());
					
				}
			}
		}while(flag);

	}

}
		
