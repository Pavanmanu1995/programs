package com.mindtree.railwayticketbookingsystem.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.railwayticketbookingsystem.entity.Train;
import com.mindtree.railwayticketbookingsystem.entity.User;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainDaoException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainServiceException;

public interface IUserTrainService extends Comparator<User> {
	public String addUser(User user) throws UserTrainServiceException;
	public String addTrain(Train train) throws UserTrainServiceException;
	public List<Train> getTrain(String source,String destination) throws UserTrainServiceException;
	public float calculateFare(float distance);
	public String storeBookingDetails(int userId,int trainId,float fare) throws UserTrainServiceException;
	public List<User> getBookingDetails(int trainId) throws UserTrainServiceException;;
}
