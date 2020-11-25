package com.mindtree.flightBooking.service.implementation;

import com.mindtree.flightBooking.dao.IFlightBookingDao;
import com.mindtree.flightBooking.dao.implementation.FlightBookingDaoImpl;
import com.mindtree.flightBooking.entity.Flight;
import com.mindtree.flightBooking.exception.FlightBookingDaoException;
import com.mindtree.flightBooking.exception.FlightBookingServiceException;
import com.mindtree.flightBooking.service.IFlightBookingService;

public class FlightBookingServiceImpl implements IFlightBookingService {

	@Override
	public String addFlight(Flight flight) throws FlightBookingServiceException {
		IFlightBookingDao dao=new FlightBookingDaoImpl();
		try {
			String mess=dao.addFlight(flight);
			return mess;
		} catch (FlightBookingDaoException e) {
			throw new FlightBookingServiceException();
		}
	}

}
