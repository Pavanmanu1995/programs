package appRunner;

import java.util.*;

import entity.Employee;
import service.serviceImpl.EmployeeService;
import service.serviceImpl.EmployeeServiceImpl;
import utility.JdbcConnection;

public class AppRunner {
	static Scanner sc = new Scanner(System.in);
	static EmployeeService es=new EmployeeServiceImpl();// Create servile layer object which will be used to call service methods
	public static void displayMenu() {
		System.out.println("1.Enter Employee Details");
		System.out.println("2.retrive all the employee details");
		System.out.println("3.update");
		System.out.println("4.delete");
		System.out.println("5.To Exit ");
		System.out.println("Enter your choice:");
	}
	
	public static Employee createEmployee() {
		// Get all user input
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.nextLine();
		System.out.println("Enter Employee salary");
		double salary = sc.nextDouble();
		System.out.println("Enter Employee age");
		int age = sc.nextInt();
		// Create Employee object
		Employee emp = new Employee(id, name, salary, age);
		// Pass that object to service layer
		return emp;
	}
	public static void main(String[] args) {
		do
		{
			displayMenu();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Employee emp=createEmployee();
				try
				{
					
				}
				break;
			case 2:
				break;
			case 3:
				break;
				
			}
		}

	}

}
