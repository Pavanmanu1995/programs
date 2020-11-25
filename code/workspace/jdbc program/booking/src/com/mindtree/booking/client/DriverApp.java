package com.mindtree.booking.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.booking.entity.Booking;
import com.mindtree.booking.exception.BookingAppException;
import com.mindtree.booking.exception.BookingServiceException;
import com.mindtree.booking.exception.InvalidAgeException;
import com.mindtree.booking.service.IBookingService;
import com.mindtree.booking.service.implementation.BookingServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		IBookingService service=new BookingServiceImpl();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do
		{
			System.out.println("1.Insert bookingDetails,if age is less than 18 throw InvalidAgeException. Price should be 10 times the totalKms entered");
			System.out.println("2.Display all the bookings with source as x and destination as y. x and y are user input");
			System.out.println("3.Fetch all the records, and sort it based on booking Id using comparable/comparator in descending order.");
			System.out.println("4.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the booking id");
				int bookingId=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the person name");
				String name=sc.nextLine();
				System.out.println("enter the source");
				String source=sc.nextLine();
				System.out.println("enter the destination");
				String destination=sc.nextLine();
				System.out.println("enter the distance");
				float distance=sc.nextFloat();
				System.out.println("enter the price");
				float price=sc.nextFloat();
				System.out.println("enter the person age");
				int age=sc.nextInt();
				
				try {
					boolean mess=service.validateAge(age);
					System.out.println(mess);
				} catch (InvalidAgeException e) {
					System.out.println("something went wrong");
				}
				float amount=service.amountCalculation(price);
				Booking book=new Booking(bookingId,name,source,destination,distance,amount,age);
				try {
					String mess=service.addBookings(book);
					System.out.println(mess);
				} catch (BookingServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 2:
				List<Booking> list=null;
				System.out.println("enter the source");
				source=sc.nextLine();
				sc.nextLine();
				System.out.println("enter the destination");
				destination=sc.nextLine();
				try {
					list = service.getBooking(source, destination);
					System.out.println(list.toString());
				} catch (BookingServiceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter booking id");
				bookingId = sc.nextInt();
				try {
					List<Booking> books = service.getBookingDetails(bookingId);
					System.out.println("Showing booking details");

					for (Booking b :books ) {
						System.out.println(b.toString());
					}
				} catch (BookingServiceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				flag=false;
				
			}
			
			
		}
		while(flag);
		

	}

}
