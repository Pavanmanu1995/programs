package com.mindtree.movieBooking.service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.mindtree.movieBooking.entity.BookingPortal;
import com.mindtree.movieBooking.exception.MovieBookingServiceException;

public interface BookingPortalService {
	
	public BookingPortal addBookingPortalData(BookingPortal bookingPortal) throws MovieBookingServiceException;

	public List<BookingPortal> getBookingPortalData() throws MovieBookingServiceException;

	public void deleteBookingPorttalData(String portalName) throws MovieBookingServiceException;

	public Set<BookingPortal> getBookingPortalDetails() throws MovieBookingServiceException;

	public Set<BookingPortal> getBookingPortalDetail() throws MovieBookingServiceException;

}
