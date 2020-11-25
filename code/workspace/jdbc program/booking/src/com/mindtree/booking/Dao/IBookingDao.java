package com.mindtree.booking.Dao;

import java.util.List;

import com.mindtree.booking.entity.Booking;
import com.mindtree.booking.exception.BookingDaoException;
import com.mindtree.booking.exception.BookingServiceException;

public interface IBookingDao {

	public String addBookings(Booking book) throws BookingDaoException;

	public List<Booking> getBooking(String source, String destination) throws BookingDaoException, BookingServiceException;

	public List<Booking> getBookingDetails(int bookingId) throws BookingDaoException;
	

}
