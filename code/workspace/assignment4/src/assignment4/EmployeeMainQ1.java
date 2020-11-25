package assignment4;

import java.util.Scanner;

public class EmployeeMainQ1 {
		static String name;
		static String desig;
		static String dep;
		public static boolean nameValidation(String name)
		{
			if(name==null||name.length()==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		public static boolean desigValidation(String desig)
		{
			if(desig.equals("developer")||desig.equals("tester")||desig.equals("lead")||desig.equals("manager"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static boolean deptValidation(String dep)
		{
			if(dep.equals("tth")||dep.equals("rcm")||dep.equals("digital")||dep.equals("devops"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Employee emp=new Employee();
			System.out.println("enter the empid");
			int id=sc.nextInt();
			sc.nextLine();
			emp.setId(id);
			boolean flag=true;
			do
			{
				System.out.println("enter the name");
				name=sc.nextLine();
				boolean res=nameValidation(name);
				if(res)
				{
					emp.setEmpName(name);
					flag=false;
				}
				else
					System.out.println("invalid input");
			}
			while(flag);
			flag=true;
			do
			{
				System.out.println("enter the designation");
				desig=sc.nextLine();
				boolean res1=desigValidation(desig);
				if(res1)
				{
					emp.setEmpDesig(desig);
					flag=false;
				}
				else
					System.out.println("invalid input");
			}
			while(flag);
			flag=true;
			do
			{
				System.out.println("enter the department");
				dep=sc.nextLine();
				boolean res2=deptValidation(dep);
				if(res2)
				{
					emp.setEmpDep(dep);
					flag=false;
				}
				else
					System.out.println("invalid input");
			}
			while(flag);
			System.out.println("enter 1 to display");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("employee details are");
				System.out.println(emp.getId()+" ");
				System.out.println(emp.getEmpName()+" ");
				System.out.println(emp.getEmpDesig()+" ");
				System.out.println(emp.getEmpDep()+" ");
			}else
				System.out.println("invalid choice");
				
				}
			}
