package com.mindtree.jdbcCafe.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.jdbcCafe.entity.Cafe;
import com.mindtree.jdbcCafe.entity.CafeManager;
import com.mindtree.jdbcCafe.exception.CafeServiceException;
import com.mindtree.jdbcCafe.exception.ManagerNotFoundException;
import com.mindtree.jdbcCafe.service.ICafeService;
import com.mindtree.jdbcCafe.service.implementation.CafeServiceImpl;

public class CafeApp {
	public static void main(String[] args) {
		ICafeService service=new CafeServiceImpl();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			System.out.println("1.Add Café with their manager");
			System.out.println("2.Get All café under a manager (Use managerId)");
			System.out.println("3.Get All Café along with manager details whose revenue is greater than entered value");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the manager id");
				int managerId=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the magager name");
				String managerName=sc.nextLine();
				System.out.println("enter the manager salary");
				double managerSalary=sc.nextDouble();
				CafeManager manager=new CafeManager(managerId,managerName,managerSalary);
				try {
					String mess=service.addCafeManager(manager);
					System.out.println(mess);
					
				} catch (CafeServiceException e) {
					System.out.println("something went wrong");
					
				}
				System.out.println("enter the no of cafe to the manager");
				int size=sc.nextInt();
				for(int i=0;i<size;i++)
				{
				System.out.println("enter the cafe id");
				int cafeId=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the cafe name");
				String cafeName=sc.nextLine();
				System.out.println("enter the cafe revenue");
				double cafeRevenue=sc.nextDouble();
				Cafe cafe=new Cafe(cafeId,cafeName,cafeRevenue,managerId);
				try {
					String mess=service.addCafe(cafe);
					System.out.println(mess);
				}
				catch (CafeServiceException e) {
					System.out.println("something went wrong");	
				}
				}
				break;
			case 2:
				System.out.println("enter the manager id");
				managerId=sc.nextInt();
				try {
					List<Cafe> cafeList=service.getCafeDetails(managerId);
					for(Cafe c:cafeList)
					{
					System.out.println(cafeList.toString());
					}
				} catch (CafeServiceException | ManagerNotFoundException e) {
					System.out.println("something went wrong");
				}
				
				
				
			}
			
		}
		while(flag);
	
		

	}

}
