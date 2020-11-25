package com.example.Application.service;

import java.util.List;

import com.example.Application.entity.MovieTicket;

public interface MovieTicketService {

	List<MovieTicket> getMovieTicketDetails();

	MovieTicket insertMovieTicketDetails(MovieTicket movieTicket);

	List<MovieTicket> sortTicket();

}
