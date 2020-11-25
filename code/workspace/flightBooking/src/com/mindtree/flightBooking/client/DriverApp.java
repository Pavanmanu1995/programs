package com.mindtree.flightBooking.client;

import java.util.Scanner;

import com.mindtree.flightBooking.entity.Flight;
import com.mindtree.flightBooking.service.IFlightBookingService;
import com.mindtree.flightBooking.service.implementation.FlightBookingServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IFlightBookingService service=new FlightBookingServiceImpl();
		boolean flag=true;
		do
		{
			System.out.println("1.Add flight");
			System.out.println("2.Add person");
			System.out.println("3.Assign flight to a person and reduce bank balance of the person after booking");
			System.out.println("4.display all flights");
			System.out.println("5.display all the persons who as account balance > 50000");
			System.out.println("6.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the flight id");
				int flightId=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the flight name");
				String flightName=sc.nextLine();
				System.out.println("enter the ticket cost");
				float ticketCost=sc.nextInt();
				Flight flight=new Flight(flightId,flightName,ticketCost);
				try {
					String mess=service.addFlight(flight);
					System.out.println(mess);
					
				} catch (Exception e) {
					System.out.println("something went wrong");
				}
				break;
			case 2:
				
				
				
				
			}
		}
		while(flag);
		

	}

}
