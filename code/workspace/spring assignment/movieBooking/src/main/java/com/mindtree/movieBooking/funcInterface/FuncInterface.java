package com.mindtree.movieBooking.funcInterface;

import com.mindtree.movieBooking.entity.BookingPortal;
import com.mindtree.movieBooking.exception.MovieBookingServiceException;

@FunctionalInterface
public interface FuncInterface {
	public BookingPortal function() throws MovieBookingServiceException; 

}
