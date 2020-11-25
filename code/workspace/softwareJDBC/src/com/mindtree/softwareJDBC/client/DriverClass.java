package com.mindtree.softwareJDBC.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.softwareJDBC.entity.Software;
import com.mindtree.softwareJDBC.exception.customs.SoftwareServiceException;
import com.mindtree.softwareJDBC.service.ISoftwareService;
import com.mindtree.softwareJDBC.service.SoftwareServiceImp;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ISoftwareService ser=new SoftwareServiceImp();
		boolean flag=true;
		do
		{
			System.out.println("1.add software details");
			System.out.println("2.retrive software details");
			System.out.println("3.delete software details");
			System.out.println("4.update software details");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the software id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the software license number");
				String licenseNumber=sc.nextLine();
				System.out.println("enter the software name");
				String name=sc.nextLine();
				System.out.println("enter the software cost");
				double cost=sc.nextDouble();
				Software software=new Software(id,licenseNumber,name,cost);
				try {
					String mess=ser.addSoftware(software);
					System.out.println(mess);
				} catch (SoftwareServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 2:
				try {
					List<Software> softwareList=ser.getSoftware();
					for(Software s:softwareList)
					{
						System.out.println(s.toString());
					}
				} catch (SoftwareServiceException e) {
					System.out.println("something went wrong");
				}
			}
		}
		while(flag);

	}

}
