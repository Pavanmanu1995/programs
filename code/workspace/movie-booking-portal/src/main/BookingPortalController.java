package com.mindtree.bookingportal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bookingportal.dto.BookingPortalDTO;
import com.mindtree.bookingportal.dto.ResponseBody;
import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.entity.MovieTicket;
import com.mindtree.bookingportal.exception.BookingPortalAppException;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.mindtree.bookingportal.service.IBookingPortalService;
import com.mindtree.bookingportal.service.ITicketService;

@RestController
@RequestMapping("/bookingPortal")
public class BookingPortalController {

	@Autowired
	IBookingPortalService bookingPortalService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping(value = "/add")
	public ResponseEntity<?> addBookingPortal(@Valid @RequestBody BookingPortalDTO portalDetails)
			throws BookingPortalAppException {

		return new ResponseEntity<ResponseBody<BookingPortalDTO>>(
				new ResponseBody<BookingPortalDTO>(
						modelMapper.map(bookingPortalService.addBookingPortal(
								modelMapper.map(portalDetails, BookingPortal.class)), BookingPortalDTO.class),
						null, "Booking Portal Added successfully", true),
				HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<?> deleteBooingPortal(@RequestParam int portalId) throws BookingPortalAppException {
			bookingPortalService.deletePortal(portalId);
			return new ResponseEntity<ResponseBody<Void>>(new ResponseBody<Void>(null,null, "booking portal is deleted", true),HttpStatus.OK);
		}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAll() throws BookingPortalAppException {
		return new ResponseEntity<ResponseBody<List<BookingPortalDTO>>>(new ResponseBody<List<BookingPortalDTO>>(
				modelMapper.map(bookingPortalService.getAll(), new TypeToken<List<BookingPortalDTO>>() {
				}.getType()), null, "Booking Portal list found", true), HttpStatus.OK);

	}

}
