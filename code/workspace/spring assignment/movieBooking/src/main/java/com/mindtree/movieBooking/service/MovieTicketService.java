package com.mindtree.movieBooking.service;

import java.util.List;

import com.mindtree.movieBooking.entity.MovieTicket;
import com.mindtree.movieBooking.exception.MovieBookingServiceException;

public interface MovieTicketService {
	
	public MovieTicket addMovieTicketData(MovieTicket movieTicket, String portalName)
			throws MovieBookingServiceException;

	public void deleteMovieData(String movieName) throws MovieBookingServiceException;

	public void writingIntoExcel() throws MovieBookingServiceException;

	public List<String> readingFromExcel() throws MovieBookingServiceException;

}

