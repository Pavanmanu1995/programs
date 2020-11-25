package com.mindtree.trainApp.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.trainApp.entity.Train;
import com.mindtree.trainApp.service.TrainServiceImplementation;

public class TrainApp {
	static Scanner sc=new Scanner(System.in);
	static List<Train> list=new ArrayList<Train>();
	
	public static int getIntInput()
	{
		return sc.nextInt();
	}
	
	public static String getStringInput()
	{
		return sc.nextLine();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TrainServiceImplementation service=new TrainServiceImplementation();
		
		boolean flag=true;
		do
		{
			System.out.println("1.insert train into record");
			System.out.println("2.display all trains");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			int choice=getIntInput();
			switch(choice)
			{
				case 1:
					System.out.println("enter the train id");
					int id=getIntInput();
					sc.nextLine();
					System.out.println("enter the train name");
					String name=getStringInput();
					Train train=new Train(id,name);
					service.insertTrainDetails(train);
					break;
				case 2:
					List<Train> t=service.displayTrains();
					System.out.println(t);
					break;
				case 3:
					flag=false;
					break;
					
			}
		}
		while(flag);
		

	}

}
