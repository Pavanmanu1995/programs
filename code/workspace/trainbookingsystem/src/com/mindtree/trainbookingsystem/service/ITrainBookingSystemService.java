package com.mindtree.trainbookingsystem.service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import com.mindtree.trainbookingsystem.entity.Train;
import com.mindtree.trainbookingsystem.entity.User;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;

public interface ITrainBookingSystemService extends Comparator<User> {
	public String addUser(User user) throws TrainBookingSystemServiceException;
	public String addTrain(Train train) throws TrainBookingSystemServiceException;
	public List<Train> getTrain(String source,String destination) throws SQLException, TrainBookingSystemServiceException;
	public float calculateFare(float distance);
	public String storeBookingDetails(int userId,int trainId,float fare) throws TrainBookingSystemServiceException;
	public List<User> getBookingDetails(int trainId) throws TrainBookingSystemServiceException;
}
