package com.mindtree.flightBooking.service;

import com.mindtree.flightBooking.entity.Flight;
import com.mindtree.flightBooking.exception.FlightBookingServiceException;

public interface IFlightBookingService {
	public String addFlight(Flight flight) throws FlightBookingServiceException;

}
