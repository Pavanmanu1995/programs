package com.mindtree.booking.service.implementation;

import java.util.Collections;
import java.util.List;

import com.mindtree.booking.Dao.IBookingDao;
import com.mindtree.booking.Dao.implementation.BookingDaoImpl;
import com.mindtree.booking.entity.Booking;
import com.mindtree.booking.exception.BookingDaoException;
import com.mindtree.booking.exception.BookingServiceException;
import com.mindtree.booking.exception.InvalidAgeException;
import com.mindtree.booking.service.IBookingService;

public class BookingServiceImpl implements IBookingService {

	@Override
	public boolean validateAge(int age) throws InvalidAgeException {
		try {
			if (age > 18) {
				return true;
			}

		} catch (Exception e) {
			throw new InvalidAgeException();
		}

		return false;
	}

	@Override
	public float amountCalculation(float price) {
		float cost = price * 10;
		return cost;
	}

	@Override
	public String addBookings(Booking book) throws BookingServiceException {
		IBookingDao dao = new BookingDaoImpl();
		try {
			String msg = dao.addBookings(book);
			return msg;
		} catch (BookingDaoException e) {
			throw new BookingServiceException();

		}
	}

	@Override
	public List<Booking> getBooking(String source, String destination) throws BookingServiceException {
		IBookingDao dao = new BookingDaoImpl();
		List<Booking> list;
		try {
			list = dao.getBooking(source, destination);
		} catch (BookingDaoException e) {
			throw new BookingServiceException();
		}
		return list;
	}

	@Override
	public List<Booking> getBookingDetails(int bookingId) throws BookingServiceException {
		IBookingDao dao = new BookingDaoImpl();
		List<Booking> list;
		try {
			list = dao.getBookingDetails(bookingId);
			IBookingService obj = new BookingServiceImpl();
			Collections.sort(list, obj);
		} catch (BookingDaoException e) {
			throw new BookingServiceException();
		}
		return list;

	}

	@Override
	public int compare(Booking b1, Booking b2) {
		if (b1.getBookingId() > b2.getBookingId()) {
			return -1;
		} else if(b1.getBookingId() < b2.getBookingId()) {
			return 1;
		}
		return 0;
	}

}
