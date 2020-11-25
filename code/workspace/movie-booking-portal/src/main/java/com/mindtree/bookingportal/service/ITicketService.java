package com.mindtree.bookingportal.service;

import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.entity.MovieTicket;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;

public interface ITicketService {
	public BookingPortal bookTicket(MovieTicket ticketDetails, String bookingPortalName) throws BookingPortalServiceException;
}
