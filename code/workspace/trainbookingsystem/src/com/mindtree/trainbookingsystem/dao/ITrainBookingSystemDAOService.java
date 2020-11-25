package com.mindtree.trainbookingsystem.dao;

import java.sql.SQLException;
import java.util.List;

import com.mindtree.trainbookingsystem.entity.Train;
import com.mindtree.trainbookingsystem.entity.User;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemDaoException;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;

public interface ITrainBookingSystemDAOService {
	public boolean addUserDao(User user) throws TrainBookingSystemServiceException;
	public boolean addTrainDao(Train train) throws TrainBookingSystemServiceException;
	public List<Train> getTrainDao(String source,String destination) throws TrainBookingSystemServiceException;
	public boolean storeBookingDetailsDao(int userId,int trainId,float fare) throws TrainBookingSystemServiceException;
	public List<User> getBookingDetailsDao(int userId) throws TrainBookingSystemServiceException;
}
