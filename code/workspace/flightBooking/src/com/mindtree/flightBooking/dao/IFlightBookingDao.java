package com.mindtree.flightBooking.dao;

import com.mindtree.flightBooking.entity.Flight;
import com.mindtree.flightBooking.exception.FlightBookingDaoException;

public interface IFlightBookingDao {

	public String addFlight(Flight flight) throws FlightBookingDaoException;

}
