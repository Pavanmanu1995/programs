package com.mindtree.trainbookingsystem.service;

import java.util.Collections;
import java.util.List;

import com.mindtree.trainbookingsystem.dao.ITrainBookingSystemDAOService;
import com.mindtree.trainbookingsystem.dao.TrainBookingServiceDAOImpl;
import com.mindtree.trainbookingsystem.entity.Train;
import com.mindtree.trainbookingsystem.entity.User;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;

public class TrainBookingSystemServiceImpl implements ITrainBookingSystemService {
	static ITrainBookingSystemDAOService daoService = new TrainBookingServiceDAOImpl();

	@Override
	public String addUser(User user) throws TrainBookingSystemServiceException {

		boolean flag = daoService.addUserDao(user);
		if (flag) {
			return "User inserted successfully";
		}
		return "failed";

	}

	@Override
	public String addTrain(Train train) throws TrainBookingSystemServiceException {

		boolean flag = daoService.addTrainDao(train);
		if (flag) {
			return "Train added successfully";
		}

		return "failed";
	}

	@Override
	public List<Train> getTrain(String source, String destination) throws TrainBookingSystemServiceException {

		List<Train> trains = daoService.getTrainDao(source, destination);
		return trains;

	}

	@Override
	public float calculateFare(float distance) {
		float fare = distance * 10;
		return fare;
	}

	@Override
	public String storeBookingDetails(int userId, int trainId, float fare)
			throws TrainBookingSystemServiceException {
		
			boolean flag = daoService.storeBookingDetailsDao(userId, trainId, fare);
			if (flag) {
				return "Booking details stored successfully";
			}
		return"failed";

	}

	@Override
	public List<User> getBookingDetails(int trainId) throws TrainBookingSystemServiceException {
		List<User> users=daoService.getBookingDetailsDao(trainId);
		ITrainBookingSystemService obj=new TrainBookingSystemServiceImpl();
		Collections.sort(users, obj);
		return users;
	}

	@Override
	public int compare(User u1, User u2) {
		if(u1.getFare()<u2.getFare()) {
			return 1;
		}
		return 0;
	}

}
