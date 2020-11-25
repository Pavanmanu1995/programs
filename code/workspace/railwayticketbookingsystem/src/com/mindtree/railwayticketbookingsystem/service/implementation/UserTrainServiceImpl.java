package com.mindtree.railwayticketbookingsystem.service.implementation;

import java.util.Collections;
import java.util.List;

import com.mindtree.railwayticketbookingsystem.dao.IUserTrainDao;
import com.mindtree.railwayticketbookingsystem.dao.implemenation.UserTrainDaoImpl;
import com.mindtree.railwayticketbookingsystem.entity.Train;
import com.mindtree.railwayticketbookingsystem.entity.User;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainDaoException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainServiceException;
import com.mindtree.railwayticketbookingsystem.service.IUserTrainService;

public class UserTrainServiceImpl implements IUserTrainService {

	@Override
	public String addUser(User user) throws UserTrainServiceException {
		IUserTrainDao dao=new UserTrainDaoImpl();
		try {
			String mess=dao.addUser(user);
			return mess;
		} catch (UserTrainDaoException e) {
			throw new UserTrainServiceException();
		}
	}

	@Override
	public String addTrain(Train train) throws UserTrainServiceException {
		IUserTrainDao dao=new UserTrainDaoImpl();
		try {
			String mess=dao.addTrain(train);
			return mess;
		} catch (UserTrainDaoException e) {
			throw new UserTrainServiceException();
		}
	}

	@Override
	public List<Train> getTrain(String source, String destination) throws UserTrainServiceException {
		IUserTrainDao dao=new UserTrainDaoImpl();
		List<Train> trains;
		try {
				trains = dao.getTrain(source, destination);
		} catch (UserTrainDaoException e) {
			throw new UserTrainServiceException();
		}
		return trains;
	}

	@Override
	public float calculateFare(float distance) {
		float fare = distance * 10;
		return fare;
	}

	@Override
	public String storeBookingDetails(int userId, int trainId, float fare) throws UserTrainServiceException {
		IUserTrainDao dao=new UserTrainDaoImpl();
		try {
			boolean mess=dao.storeBookingDetailsDao(userId,trainId,fare);
			return "booking details stored successfully";
		} catch (UserTrainDaoException e) {
			throw new UserTrainServiceException();
		}
	}

	@Override
	public List<User> getBookingDetails(int trainId) throws UserTrainServiceException {
		IUserTrainDao dao=new UserTrainDaoImpl();
		List<User> users;
		try {
			users = dao.getBookingDetails(trainId);
			IUserTrainService obj=new UserTrainServiceImpl();
			Collections.sort(users, obj);
			return users;
		} catch (UserTrainDaoException e) {
			throw new UserTrainServiceException();
		}
		
	}

	@Override
	public int compare(User u1, User u2) {
			if(u1.getFare()<u2.getFare()) {
				return 1;
			}
			return 0;
		}
	}

