package com.mindtree.movieBooking.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBooking.dto.BookingPortalDTO;
import com.mindtree.movieBooking.dto.ResponseBody;
import com.mindtree.movieBooking.entity.BookingPortal;
import com.mindtree.movieBooking.exception.MovieBookingAppException;

import com.mindtree.movieBooking.service.BookingPortalService;

// Booking Portal controller class
@RestController
public class BookingPortalController {
	
	@Autowired
	private BookingPortalService bookingPortalService;

	@Autowired
	private ModelMapper modelMapper;

	//Adding Booking Portal details to the database
	@PostMapping("/bookingportal")
	public ResponseEntity<?> addBookingPortal(@Valid @RequestBody BookingPortalDTO bookingPortal)
			throws MovieBookingAppException {

		return new ResponseEntity<ResponseBody<BookingPortalDTO>>(
				new ResponseBody<BookingPortalDTO>(
						modelMapper.map(bookingPortalService.addBookingPortalData(
								modelMapper.map(bookingPortal, BookingPortal.class)), BookingPortalDTO.class),
						null, "Booking Portal Added Sucessfully", true),
				HttpStatus.OK);

	}
    
	//Getting booking portal details from the database
	@GetMapping("/bookingportal")
	public ResponseEntity<?> getAllBookingPortal() throws MovieBookingAppException {

		return new ResponseEntity<ResponseBody<List<BookingPortalDTO>>>(new ResponseBody<List<BookingPortalDTO>>(
				modelMapper.map(bookingPortalService.getBookingPortalData(), new TypeToken<List<BookingPortalDTO>>() {
				}.getType()), null, "Bokking Portal List Found", true), HttpStatus.OK);

	}

	//Deleting booking portal using portal name
	@DeleteMapping("/bookingportal/{portalName}")
	public ResponseEntity<?> deleteBookingPortal(@PathVariable String portalName) throws MovieBookingAppException {

		bookingPortalService.deleteBookingPorttalData(portalName);
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "Booking Porttal with name " + portalName + " is deleted. ", true),
				HttpStatus.OK);

	}
	
	//Getting all the Booking portal details and serializing the data present in the database
	@GetMapping("/serialization")
	public ResponseEntity<?> getBookingPortalDetails() throws MovieBookingAppException {

		return new ResponseEntity<ResponseBody<Set<BookingPortalDTO>>>(new ResponseBody<Set<BookingPortalDTO>>(
				modelMapper.map(bookingPortalService.getBookingPortalDetails(), new TypeToken<Set<BookingPortalDTO>>() {
				}.getType()), null, "Booking Portal detalis are serialized", true), HttpStatus.OK);
	}
	
	//converting serialization to deserialization
	@GetMapping("/deserialization")
	public ResponseEntity<?> getBookingPortalDetail() throws MovieBookingAppException {

		return new ResponseEntity<ResponseBody<Set<BookingPortalDTO>>>(new ResponseBody<Set<BookingPortalDTO>>(
				modelMapper.map(bookingPortalService.getBookingPortalDetail(), new TypeToken<Set<BookingPortalDTO>>() {
				}.getType()), null, "Booking Portal details are deserialized", true), HttpStatus.OK);
	}
	

}
