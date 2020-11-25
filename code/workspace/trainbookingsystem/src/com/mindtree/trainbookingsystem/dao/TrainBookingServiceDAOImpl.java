package com.mindtree.trainbookingsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.trainbookingsystem.entity.Train;
import com.mindtree.trainbookingsystem.entity.User;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemDaoException;
import com.mindtree.trainbookingsystem.exception.TrainBookingSystemServiceException;
import com.mindtree.trainbookingsystem.exception.customs.DestinationNotfoundException;
import com.mindtree.trainbookingsystem.exception.customs.SourceNotFoundException;
import com.mindtree.trainbookingsystem.exception.customs.TrainAlreadyPresentException;
import com.mindtree.trainbookingsystem.exception.customs.TrainNotFoundException;
import com.mindtree.trainbookingsystem.exception.customs.UserAlreadyPresentException;
import com.mindtree.trainbookingsystem.exception.customs.UserNotFoundException;
import com.mindtree.trainbookingsystem.utility.ConnectionUtility;

public class TrainBookingServiceDAOImpl implements ITrainBookingSystemDAOService {
	static Connection con = null;
	static ResultSet res = null;
	static PreparedStatement pstmt = null;
	static ConnectionUtility conn = new ConnectionUtility();
	static List<Train> trains = new ArrayList<>();

	@Override
	public boolean addUserDao(User user) throws TrainBookingSystemServiceException {
		try {
			con = conn.connection();

			String sql = "Select * from user where userId=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, user.getUserId());

			res = pstmt.executeQuery();

			if (res.next()) {
				throw new UserAlreadyPresentException("user already present");
			}

			pstmt = con.prepareStatement("insert into user (userId,username) values(?,?)");
			pstmt.setInt(1, user.getUserId());
			pstmt.setString(2, user.getUserName());
			int flag = pstmt.executeUpdate();
			con.close();
			if (flag > 0) {
				return true;
			}
		} catch (TrainBookingSystemDaoException | SQLException e) {
			throw new TrainBookingSystemServiceException(e.getMessage(), e);
		}

		return false;
	}

	@Override
	public boolean addTrainDao(Train train) throws TrainBookingSystemServiceException {
		try {
			con = conn.connection();

			String sql = "Select * from train where trainId=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, train.getTrainId());
			res = pstmt.executeQuery();

			if (res.next()) {
				throw new TrainAlreadyPresentException("Train already present");
			}

			pstmt = con.prepareStatement(
					"insert into train (trainId,trainName,source,destination,distance) values(?,?,?,?,?)");
			pstmt.setInt(1, train.getTrainId());
			pstmt.setString(2, train.getTrainName());
			pstmt.setString(3, train.getSource());
			pstmt.setString(4, train.getDestination());
			pstmt.setFloat(5, train.getDistance());
			int flag = pstmt.executeUpdate();
			con.close();
			if (flag > 0) {
				return true;
			}
		} catch (TrainBookingSystemDaoException | SQLException e) {
			throw new TrainBookingSystemServiceException(e.getMessage(), e);
		}

		return false;
	}

	@Override
	public List<Train> getTrainDao(String source, String destination) throws TrainBookingSystemServiceException {
		List<String> sourceCounter = new ArrayList<>();
		List<String> destinationCounter = new ArrayList<>();
		try {
			con = conn.connection();

			pstmt = con.prepareStatement("select * from train where source=?");
			pstmt.setString(1, source);
			res = pstmt.executeQuery();

			while (res.next()) {
				String temp = res.getString(3);
				sourceCounter.add(temp);
			}
			if (sourceCounter.contains(source) == false) {
				throw new SourceNotFoundException("Source not found");
			}

			res.close();
			pstmt.close();

			pstmt = con.prepareStatement("select * from train where destination=?");
			pstmt.setString(1, destination);
			res = pstmt.executeQuery();

			while (res.next()) {
				String temp = res.getString(4);

				destinationCounter.add(temp);

			}
			if (destinationCounter.contains(destination) == false) {
				throw new DestinationNotfoundException("Destination not found");
			}

			res.close();
			pstmt.close();

			pstmt = con.prepareStatement("select * from train where source=? and destination=?");
			pstmt.setString(1, source);
			pstmt.setString(2, destination);
			res = pstmt.executeQuery();
			while (res.next()) {
				int id = res.getInt(1);
				String name = res.getString(2);
				String source1 = res.getString(3);
				String destination1 = res.getString(4);
				float distance = res.getFloat(5);
				Train train = new Train(id, name, source1, destination1, distance);
				trains.add(train);

			}
			res.close();
			pstmt.close();
			con.close();
		} catch (TrainBookingSystemDaoException | SQLException e) {
			throw new TrainBookingSystemServiceException(e.getMessage(), e);
		}

		return trains;
	}

	@Override
	public boolean storeBookingDetailsDao(int userId, int trainId, float fare)
			throws TrainBookingSystemServiceException {
		List<Integer> userCount = new ArrayList<>();
		try {
			con = conn.connection();
			pstmt = con.prepareStatement("select * from user where userId=?");
			pstmt.setInt(1, userId);
			res = pstmt.executeQuery();
			while (res.next()) {
				int temp = res.getInt(1);

				userCount.add(temp);
			}

			if (userCount.contains(userId) == false) {
				throw new UserNotFoundException("User not found");
			}

			pstmt.close();
			res.close();

			pstmt = con.prepareStatement("update user set trainId=? ,totalFare=? where userId=?");
			pstmt.setInt(1, trainId);
			pstmt.setFloat(2, fare);
			pstmt.setInt(3, userId);
			int n = pstmt.executeUpdate();
			pstmt.close();
			res.close();
			con.close();
			if (n > 0) {
				return true;
			}
		} catch (TrainBookingSystemDaoException | SQLException e) {
			throw new TrainBookingSystemServiceException(e.getMessage());
		}
		return false;
	}

	@Override
	public List<User> getBookingDetailsDao(int userId) throws TrainBookingSystemServiceException {
		List<User> users = new ArrayList<User>();
		try {
			con = conn.connection();
			pstmt = con.prepareStatement("select * from user where trainId=?");
			pstmt.setInt(1, userId);
			res = pstmt.executeQuery();
			while (res.next()) {
				int uId = res.getInt(1);
				String uName = res.getString(2);
				int tId = res.getInt(3);
				float fare = res.getFloat(4);
				User user = new User(uId, uName, tId, fare);
				users.add(user);
			}
			if(res==null) {
				throw new TrainNotFoundException("Train not found");
			}

		} catch (SQLException | TrainNotFoundException e) {

			throw new TrainBookingSystemServiceException(e.getMessage(),e);
		}

		return users;
	}

}
