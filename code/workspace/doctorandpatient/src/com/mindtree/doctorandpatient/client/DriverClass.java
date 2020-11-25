package com.mindtree.doctorandpatient.client;

import java.util.Scanner;
import com.mindtree.doctorandpatient.service.implementation.DoctorPatientServiceImpl;

public class DriverClass {

	public static void main(String[] args) {
		
		//create obj for service
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			System.out.println("1.Assign doctor to patient");
			System.out.println("2.display all patient details of perticular doctor in sorted order");
			System.out.println("3.Display all the doctors having patient count greater than three in a sorted order based on there year of experience");
			System.out.println("4.Give concession of amount 500/- to all the patient of a particular doctor and update the bill amount of all the patients under that doctor");
			System.out.println("5.List all the doctors and there patient details in .txt file using file I/O.");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("enter the doctor name");
				String doctorName=sc.nextLine();
				System.out.println("enter the patient name");
				String patientName=sc.nextLine();
				
				//call service function for case 1
				
			}
		}
		while(flag);
		

	}

}
