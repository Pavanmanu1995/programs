package com.mindtree.trainbookingsystem.client;

import java.sql.SQLException;
import java.util.List;

import com.mindtree.trainbookingsystem.entity.Train;
import com.mindtree.trainbookingsystem.entity.User;
import com.mindtree.trainbookingsystem.exception.TrainBookingApplicationException;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;
import com.mindtree.trainbookingsystem.service.ITrainBookingSystemService;
import com.mindtree.trainbookingsystem.service.TrainBookingSystemServiceImpl;
import com.mindtree.trainbookingsystem.utility.Initialize;

public class DriverClass {

	public static void main(String[] args) {
		Initialize in = new Initialize();
		ITrainBookingSystemService service = new TrainBookingSystemServiceImpl();
		boolean flag = true;
		do {
			System.out.println("1. Add user");
			System.out.println("2. Add train");
			System.out.println("3. Book ticket for user");
			System.out.println("4. Get booking details of a train");
			System.out.print("Enter choice:-");
			int choice = in.setInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter user id");
				int userId = in.setInt();
				System.out.println("Enter username");
				String username = in.setString();
				User user = new User(userId, username);
				try {
					String msg = service.addUser(user);
					System.out.println(msg);
				} catch (TrainBookingApplicationException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 2: {
				System.out.println("Enter train id");
				int trainId = in.setInt();
				System.out.println("Enter train name");
				String trainName = in.setString();
				System.out.println("Enter source");
				String source = in.setString();
				System.out.println("Enter destination");
				String destination = in.setString();
				System.out.println("Enter total distance covered");
				float distance = in.setFloat();
				Train train = new Train(trainId, trainName, source, destination, distance);
				try {
					String msg = service.addTrain(train);
					System.out.println(msg);
				} catch (TrainBookingApplicationException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 3: {
				try {
					List<Train> trains = null;
					System.out.println("Enter source");
					String source = in.setString();
					System.out.println("Enter destination");
					String destination = in.setString();
					try {
						trains = service.getTrain(source, destination);
						System.out.println(trains.toString());
					} catch (SQLException | TrainBookingSystemServiceException e) {
						System.out.println(e.getMessage());
						break;
					}
					System.out.println("Select train id");
					int trainId = in.setInt();
					System.out.println("Enter user id");
					int userId = in.setInt();
					float distance = 0;
					for (Train train : trains) {
						if (train.getTrainId() == trainId) {
							distance = train.getDistance();
						}
					}

					float fare = service.calculateFare(distance);
					String msg = service.storeBookingDetails(userId, trainId, fare);
					System.out.println(msg);
					System.out.println("Booking successfull");
					System.out.println("Fare is " + fare);
				} catch (TrainBookingApplicationException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 4: {
				System.out.println("Enter train id");
				int trainId = in.setInt();
				try {
					List<User> users = service.getBookingDetails(trainId);
					System.out.println("Showing booking details");

					for (User user : users) {
						System.out.println("\n"+user.toString());
					}
				} catch (TrainBookingApplicationException e) {
					System.out.println(e.getMessage());
				}
				break;

			}

			}
		} while (flag);

	}

}
