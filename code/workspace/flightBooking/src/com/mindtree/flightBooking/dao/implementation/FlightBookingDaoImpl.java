package com.mindtree.flightBooking.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.flightBooking.dao.IFlightBookingDao;
import com.mindtree.flightBooking.entity.Flight;
import com.mindtree.flightBooking.exception.FlightBookingDaoException;
import com.mindtree.flightBooking.utility.JDBCConnection;

public class FlightBookingDaoImpl implements IFlightBookingDao {
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static Connection con = null;

	@Override
	public String addFlight(Flight flight) throws FlightBookingDaoException {
		con =JDBCConnection.getConnection();
			try {
				ps = con.prepareStatement("insert into employee values(?,?,?)");
				ps.setInt(1, flight.getFlightId());
				ps.setString(2, flight.getFlightName());
				ps.setDouble(3, flight.getTicketCost());
				ps.execute();
				con.close();
			} catch (SQLException e) {
				throw new FlightBookingDaoException();
			}
		return "flight added successfully";
	}

}
