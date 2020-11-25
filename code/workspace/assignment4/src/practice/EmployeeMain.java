package practice;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=scan.nextInt();
		
		Employee[] empArray=new Employee[n];
		
		for(int i=0;i<n;i++) {
		System.out.println("Enter employee id");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter name");
		String name=scan.nextLine();
		System.out.println("Enter salary");
		double sal=scan.nextDouble();
		
		empArray[i]=new Employee(id,name,sal);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(empArray[i].id);
			System.out.println(empArray[i].getName());
			System.out.println(empArray[i].getSalary());
		}
		
	}

}
