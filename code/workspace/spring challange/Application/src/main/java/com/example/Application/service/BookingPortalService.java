package com.example.Application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Application.entity.BookingPortal;

@Service
public interface BookingPortalService {

	List<BookingPortal> getbookingPortalDetails();

	BookingPortal insertbookingPortalDetails(BookingPortal bookingPortal);

	Object deleteBookingPortal(int portalId);

}
