package com.example.Application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Application.entity.BookingPortal;
import com.example.Application.service.BookingPortalService;

@RestController
@RequestMapping("/bookingPortal")
public class BookingPortalController {

	@Autowired
	private BookingPortalService bookingPortalService;

	@GetMapping("/get/booking/portal/details")
	public List<BookingPortal> getbookingPortalDetails() {
		List<BookingPortal> bookingPortal = new ArrayList<BookingPortal>();
		bookingPortal = this.bookingPortalService.getbookingPortalDetails();
		return bookingPortal;
	}

	@PostMapping(value="/add")
	public BookingPortal insertbookingPortalDetails(@RequestBody BookingPortal bookingPortal) {
		// BookingPortal bookingPortal1=null;
		return bookingPortalService.insertbookingPortalDetails(bookingPortal);
		// return bookingPortal1;

	}

	@DeleteMapping("/delete/bookingportal/{bookingId}")
	public String deleteBookingPortal(@PathVariable int portalId) {
		bookingPortalService.deleteBookingPortal(portalId);
		return "successfully deleted";
	}

}
