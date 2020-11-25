package com.mindtree.movieBooking.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieBooking.dto.MovieTicketDTO;
import com.mindtree.movieBooking.dto.ResponseBody;
import com.mindtree.movieBooking.entity.MovieTicket;
import com.mindtree.movieBooking.exception.MovieBookingAppException;
import com.mindtree.movieBooking.service.MovieTicketService;

// this is a movie controller class
@RestController
public class MovieTicketController {

	@Autowired
	private MovieTicketService movieTicketService;

	@Autowired
	private ModelMapper modelMapper;
    
	//Adding movie Details to the database using the portal name 
	@PostMapping("/movieticket/{portalName}")
	public ResponseEntity<?> addMovieTicket(@Valid @RequestBody MovieTicketDTO movieTicket,
			@PathVariable String portalName) throws MovieBookingAppException {

		return new ResponseEntity<ResponseBody<MovieTicketDTO>>(
				new ResponseBody<MovieTicketDTO>(
						modelMapper.map(movieTicketService.addMovieTicketData(
								modelMapper.map(movieTicket, MovieTicket.class), portalName), MovieTicketDTO.class),
						null, "Movie ticket is booked Successfully", true),
				HttpStatus.OK);

	}

	//Deteting the movie details using movie name from the database 
	@DeleteMapping("/movietickte/{movieName}")
	public ResponseEntity<?> deleteMovie(@PathVariable String movieName) throws MovieBookingAppException {
		movieTicketService.deleteMovieData(movieName);
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "Movie " + movieName + " is Deleted.", true), HttpStatus.OK);

	}
    
	//Fetching all the movie details from the database and writing into the excel sheet
	@GetMapping("/movieticket/writinginexcel")
	public ResponseEntity<?> writingIntoExcel() throws MovieBookingAppException {
		movieTicketService.writingIntoExcel();
		return new ResponseEntity<ResponseBody<Void>>(
				new ResponseBody<Void>(null, null, "writing into excel is done", true), HttpStatus.OK);
	}

	//Fetching all the movie details from the excel sheet 
	@GetMapping("/movieticket/readingfromexcel")
	public ResponseEntity<?> readFromExcel() throws MovieBookingAppException {
		return new ResponseEntity<ResponseBody<List<String>>>(new ResponseBody<List<String>>(
				movieTicketService.readingFromExcel(), null, "Reading from excel done", true), HttpStatus.OK);
	}
}
