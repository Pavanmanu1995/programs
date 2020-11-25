package com.mindtree.employeeanddepartment.client;

import java.util.Scanner;

import com.mindtree.employeeanddepartment.entity.Employee;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			System.out.println("1.Add employee");
			System.out.println("2.Add department");
			System.out.println("3.get employee details based on department");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the employee id");
				int empId=sc.nextInt();
				System.out.println("enter the employee name");
				String empName=sc.nextLine();
				System.out.println("enter the department id");
				int depId=sc.nextInt();
				Employee emp=new Employee(empId,empName,depId);
				String mess=
			}
		}
		

	}

}
