package com.mindtree.railwayticketbookingsystem.client;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mindtree.railwayticketbookingsystem.entity.Train;
import com.mindtree.railwayticketbookingsystem.entity.User;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainAppException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainServiceException;
import com.mindtree.railwayticketbookingsystem.service.IUserTrainService;
import com.mindtree.railwayticketbookingsystem.service.implementation.UserTrainServiceImpl;

public class DriverClass {

	public static void main(String[] args) {
		IUserTrainService ser = new UserTrainServiceImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("1.add user");
			System.out.println("2.add trains");
			System.out.println("3.book ticket for the user");
			System.out.println("4.show all the booking details of trainId sorted in descending order of fare.");
			System.out.println("5.Write all the booking details in a text file using file I/O");
			System.out.println("6.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the user id");
				int userId = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the user name");
				String userName = sc.nextLine();
				User user = new User(userId, userName);
				try {
					String mess = ser.addUser(user);
					System.out.println(mess);
				} catch (Exception e) {
					System.out.println("something went wrong");
				}
			case 2:
				System.out.println("Enter train id");
				int trainId = sc.nextInt();
				sc.nextInt();
				System.out.println("Enter train name");
				String trainName = sc.nextLine();
				System.out.println("Enter source");
				String source = sc.nextLine();
				System.out.println("Enter destination");
				String destination = sc.nextLine();
				System.out.println("Enter total distance covered");
				float distance = sc.nextFloat();
				Train train = new Train(trainId, trainName, source, destination, distance);
				try {
					String msg = ser.addTrain(train);
					System.out.println(msg);
				} catch (UserTrainAppException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					List<Train> trains = null;
					System.out.println("Enter source");
					source = sc.nextLine();
					System.out.println("Enter destination");
					destination = sc.nextLine();
					try {
						trains = ser.getTrain(source, destination);
						System.out.println(trains.toString());
					} catch (UserTrainServiceException e) {
						System.out.println(e.getMessage());
						break;
					}
					System.out.println("enter train id");
					trainId = sc.nextInt();
					System.out.println("Enter user id");
					userId = sc.nextInt();
					distance = 0;
					for (Train t : trains) {
						if (t.getTrainId() == trainId) {
							distance = t.getDistance();
						}
					}

					float fare = ser.calculateFare(distance);
					String msg = ser.storeBookingDetails(userId, trainId, fare);
					System.out.println(msg);
					System.out.println("Booking successfull");
					System.out.println("Fare is " + fare);
				} catch (UserTrainAppException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter train id");
				trainId = sc.nextInt();
				try {
					List<User> users = ser.getBookingDetails(trainId);
					System.out.println("Showing booking details");

					for (User u : users) {
						System.out.println(u.toString());
					}
				} catch (UserTrainAppException e) {
					System.out.println(e.getMessage());
				}
				break;
			}

		} while (flag);
	}
}
