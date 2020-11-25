package com.mindtree.bookingportal.service;

import java.util.List;

import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;

public interface IBookingPortalService {
	public BookingPortal addBookingPortal (BookingPortal portalDetails) throws BookingPortalServiceException;

	public void deletePortal( int portalId) throws BookingPortalServiceException;
	
	public List<BookingPortal> getAll() throws BookingPortalServiceException;
}
