package com.mindtree.booking.service;

import java.util.Comparator;
import java.util.List;

import com.mindtree.booking.entity.Booking;
import com.mindtree.booking.exception.BookingServiceException;
import com.mindtree.booking.exception.InvalidAgeException;

public interface IBookingService extends Comparator<Booking> {
	public boolean validateAge(int age) throws InvalidAgeException;

	public float amountCalculation(float price);

	public String addBookings(Booking book) throws BookingServiceException;

	public List<Booking> getBooking(String source, String destination) throws BookingServiceException;

	public List<Booking> getBookingDetails(int bookingId) throws BookingServiceException;
	

}
