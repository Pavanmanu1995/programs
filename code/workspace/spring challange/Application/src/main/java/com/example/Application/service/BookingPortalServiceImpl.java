package com.example.Application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Application.entity.BookingPortal;
import com.example.Application.repository.BookingPortalRepo;

@Service
public class BookingPortalServiceImpl implements BookingPortalService {

	@Autowired
	private BookingPortalRepo bookingPortalRepo;

	@Override
	public List<BookingPortal> getbookingPortalDetails() {
		List<BookingPortal> bookingPortal = new ArrayList<BookingPortal>();
		bookingPortal = this.bookingPortalRepo.findAll();
		return bookingPortal;
	}

	@Override
	public BookingPortal insertbookingPortalDetails(BookingPortal bookingPortal) {
		// BookingPortal bookingPortal1=null;
		return bookingPortalRepo.save(bookingPortal);
		// return bookingPortal1;
	}

	@Override
	public Object deleteBookingPortal(int portalId) {
		bookingPortalRepo.deleteById(portalId);
		return portalId;

	}

}
