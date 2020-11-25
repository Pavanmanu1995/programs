package com.mindtree.railwayticketbookingsystem.dao;

import java.util.List;

import com.mindtree.railwayticketbookingsystem.entity.Train;
import com.mindtree.railwayticketbookingsystem.entity.User;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainDaoException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainServiceException;

public interface IUserTrainDao {
	public String addUser(User user) throws UserTrainDaoException;
	public String addTrain(Train train) throws UserTrainDaoException;
	public List<Train> getTrain(String source,String destination) throws UserTrainDaoException, UserTrainServiceException;
	public boolean storeBookingDetailsDao(int userId,int trainId,float fare) throws UserTrainDaoException, UserTrainServiceException;
	public List<User> getBookingDetails(int userId) throws UserTrainDaoException, UserTrainServiceException;
	

}
