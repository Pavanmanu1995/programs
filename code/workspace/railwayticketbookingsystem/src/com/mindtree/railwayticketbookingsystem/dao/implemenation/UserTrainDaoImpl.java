package com.mindtree.railwayticketbookingsystem.dao.implemenation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.railwayticketbookingsystem.dao.IUserTrainDao;
import com.mindtree.railwayticketbookingsystem.entity.Train;
import com.mindtree.railwayticketbookingsystem.entity.User;
import com.mindtree.railwayticketbookingsystem.exception.NoSuchDestinationException;
import com.mindtree.railwayticketbookingsystem.exception.NoSuchSourceException;
import com.mindtree.railwayticketbookingsystem.exception.NoSuchTrainException;
import com.mindtree.railwayticketbookingsystem.exception.UserAlreadyPresentException;
import com.mindtree.railwayticketbookingsystem.exception.UserNotFoundException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainDaoException;
import com.mindtree.railwayticketbookingsystem.exception.UserTrainServiceException;
import com.mindtree.railwayticketbookingsystem.utility.JDBCConnection;

public class UserTrainDaoImpl implements IUserTrainDao {
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static Connection con=null;
	static List<Train> list = new ArrayList<Train>();

	@Override
	public String addUser(User user) throws UserTrainDaoException {
		con=JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("Select * from user where userId=?");
			ps.setInt(1, user.getUserId());
			rs = ps.executeQuery();
			while(rs.next()) {
				throw new UserAlreadyPresentException("user already present");
			}

			ps= con.prepareStatement("insert into user values(?,?)");
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.executeUpdate();
			con.close();
			
		} catch (SQLException | UserAlreadyPresentException e) {
			throw new UserTrainDaoException(e.getMessage(), e);
		}

		return "User added successfully";
	}

	@Override
	public String addTrain(Train train) throws UserTrainDaoException {
		con=JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("Select * from train where trainId=?");
			ps.setInt(1, train.getTrainId());
			rs = ps.executeQuery();
			while(rs.next()) {
				throw new UserAlreadyPresentException("Train already present");
			}

			ps= con.prepareStatement("insert into train values(?,?,?,?,?)");
			ps.setInt(1, train.getTrainId());
			ps.setString(2, train.getTrainName());
			ps.setString(3, train.getSource());
			ps.setString(4, train.getDestination());
			ps.setFloat(5, train.getDistance());
			
			ps.executeUpdate();
			con.close();
			
		} catch (SQLException | UserAlreadyPresentException e) {
			throw new UserTrainDaoException(e.getMessage(), e);
		}

		return "Train added successfully";
	}

	@Override
	public List<Train> getTrain(String source, String destination) throws UserTrainDaoException, UserTrainServiceException {
		List<String> sourceCounter = new ArrayList<>();
		List<String> destinationCounter = new ArrayList<>();
		try {
			con=JDBCConnection.getConnection();

			ps = con.prepareStatement("select * from train where source=?");
			ps.setString(1, source);
			rs = ps.executeQuery();

			while (rs.next()) {
				String temp = rs.getString(3);
				sourceCounter.add(temp);
			}
			if (sourceCounter.contains(source) == false) {
				throw new NoSuchSourceException("Source not found");
			}

			rs.close();
			ps.close();

			ps = con.prepareStatement("select * from train where destination=?");
			ps.setString(1, destination);
			rs = ps.executeQuery();

			while (rs.next()) {
				String temp = rs.getString(4);

				destinationCounter.add(temp);

			}
			if (destinationCounter.contains(destination) == false) {
				throw new NoSuchDestinationException("Destination not found");
			}

			rs.close();
			ps.close();

			ps = con.prepareStatement("select * from train where source=? and destination=?");
			ps.setString(1, source);
			ps.setString(2, destination);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String source1 = rs.getString(3);
				String destination1 = rs.getString(4);
				float distance = rs.getFloat(5);
				Train train = new Train(id, name, source1, destination1, distance);
				list.add(train);

			}
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException | NoSuchSourceException | NoSuchDestinationException e) {
			throw new UserTrainServiceException(e.getMessage(), e);
		}
		return list;

		
	}

	@Override
	public boolean storeBookingDetailsDao(int userId, int trainId, float fare) throws UserTrainDaoException, UserTrainServiceException {
		List<Integer> userCount = new ArrayList<>();
		try {
			con=JDBCConnection.getConnection();
			ps = con.prepareStatement("select * from user where userId=?");
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			while (rs.next()) {
				int temp = rs.getInt(1);

				userCount.add(temp);
			}

			if (userCount.contains(userId) == false) {
				throw new UserNotFoundException("User not found");
			}

			ps.close();
			rs.close();

			ps = con.prepareStatement("update user set trainId=? ,totalFare=? where userId=?");
			ps.setInt(1, trainId);
			ps.setFloat(2, fare);
			ps.setInt(3, userId);
			int n = ps.executeUpdate();
			ps.close();
			rs.close();
			con.close();
			if (n > 0) {
				return true;
			}
		} catch (SQLException | UserNotFoundException e) {
			throw new UserTrainServiceException(e.getMessage());
		}
		return false;
	}

	@Override
	public List<User> getBookingDetails(int userId) throws UserTrainDaoException, UserTrainServiceException {
		List<User> users = new ArrayList<User>();
		try {
			con=JDBCConnection.getConnection();
			ps = con.prepareStatement("select * from user where trainId=?");
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			while (rs.next()) {
				int uId = rs.getInt(1);
				String uName = rs.getString(2);
				int tId = rs.getInt(3);
				float fare = rs.getFloat(4);
				User user = new User(uId, uName, tId, fare);
				users.add(user);
			}
			if(rs==null) {
				throw new NoSuchTrainException("Train not found");
			}

		} catch (SQLException | NoSuchTrainException e) {

			throw new UserTrainServiceException(e.getMessage(),e);
		}

		return users;
	}

	}

