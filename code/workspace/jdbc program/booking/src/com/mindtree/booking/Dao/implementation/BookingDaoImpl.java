package com.mindtree.booking.Dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.booking.Dao.IBookingDao;
import com.mindtree.booking.entity.Booking;
import com.mindtree.booking.exception.BookingDaoException;
import com.mindtree.booking.exception.BookingServiceException;
import com.mindtree.booking.utility.JDBCConnection;

public class BookingDaoImpl implements IBookingDao {
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static Connection con = null;

	@Override
	public String addBookings(Booking book) throws BookingDaoException {
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("insert into book value(?,?,?,?,?,?,?)");
			ps.setInt(1, book.getBookingId());
			ps.setString(2, book.getName());
			ps.setString(3, book.getSource());
			ps.setString(4, book.getDestination());
			ps.setFloat(5, book.getDistance());
			ps.setFloat(6, book.getPrice());
			ps.setInt(7, book.getAge());
			ps.execute();
			con.close();
		} catch (SQLException e) {
			throw new BookingDaoException();

		}
		return "added successfully";
	}

	@Override
	public List<Booking> getBooking(String source, String destination)
			throws BookingDaoException, BookingServiceException {
		List<Booking> list = null;
		try {
			ps = con.prepareStatement("select * from book where source=? and destination=?");
			ps.setString(1, source);
			ps.setString(2, destination);
			rs = ps.executeQuery();
			while (rs.next()) {
				int BookingId = rs.getInt(1);
				String name = rs.getString(2);
				String source1 = rs.getString(3);
				String destination1 = rs.getString(4);
				float distance = rs.getFloat(5);
				float price = rs.getFloat(6);
				int age = rs.getInt(7);
				Booking book = new Booking(BookingId, name, source1, destination1, distance, price, age);

			}

			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			throw new BookingServiceException();
		}
		return list;

	}

	@Override
	public List<Booking> getBookingDetails(int bookingId) throws BookingDaoException {
		List<Booking> booklist=new ArrayList<>();
		con = JDBCConnection.getConnection();
		try {
			ps = con.prepareStatement("select * from book");
			rs=ps.executeQuery();
			while(rs.next())
			{
				booklist.add(new Booking(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getFloat(5),rs.getFloat(6),rs.getInt(7)));
			}
			
		} catch (SQLException e) {
			throw new BookingDaoException();
		}
		return booklist;
	}

}
