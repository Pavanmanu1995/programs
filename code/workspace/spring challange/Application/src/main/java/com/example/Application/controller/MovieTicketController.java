package com.example.Application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Application.entity.MovieTicket;
import com.example.Application.service.MovieTicketService;

@RestController
public class MovieTicketController {

	@Autowired
	private MovieTicketService movieTicketService;

	@GetMapping("/get/Movie/ticket/details")
	public List<MovieTicket> getMovieTicketDetails() {
		List<MovieTicket> movieTicket = new ArrayList<MovieTicket>();
		movieTicket = this.movieTicketService.getMovieTicketDetails();
		return movieTicket;
	}

	@PostMapping("/insert/movie/ticket/details")
	public MovieTicket insertMovieTicketDetails(@RequestBody MovieTicket movieTicket) {
		MovieTicket movieTicket1 = null;
		movieTicket1 = this.movieTicketService.insertMovieTicketDetails(movieTicket);
		return movieTicket1;

	}

	@GetMapping("/sort")
	public List<MovieTicket> sortTicket() {
		List<MovieTicket> movieTicket = new ArrayList<MovieTicket>();
		movieTicket = this.movieTicketService.sortTicket();
		return movieTicket;
	}

}
