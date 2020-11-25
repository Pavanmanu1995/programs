package com.mindtree.bookingportal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bookingportal.dto.MovieTicketDTO;
import com.mindtree.bookingportal.dto.ResponseBody;
import com.mindtree.bookingportal.entity.MovieTicket;
import com.mindtree.bookingportal.exception.BookingPortalAppException;
import com.mindtree.bookingportal.exception.customs.BookingPortalServiceException;
import org.modelmapper.ModelMapper;
import com.mindtree.bookingportal.service.ITicketService;

@RestController
public class MovieTicketController {

	@Autowired
	ITicketService ticketService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/movieticket/{portalName}")
	public ResponseEntity<?> bookTicket(@Valid @RequestBody MovieTicketDTO ticketDetails,
			@PathVariable String bookingPortalName) throws BookingPortalAppException {
		return new ResponseEntity<ResponseBody<MovieTicketDTO>>(
				new ResponseBody<MovieTicketDTO>(
						modelMapper.map(ticketService.bookTicket(modelMapper.map(ticketDetails, MovieTicket.class),
								bookingPortalName), MovieTicketDTO.class),
						null, "movie ticket is booked successfully", true),
				HttpStatus.OK);

	}

}
