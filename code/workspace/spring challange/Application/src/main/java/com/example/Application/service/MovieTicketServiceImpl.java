package com.example.Application.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Application.entity.MovieTicket;
import com.example.Application.repository.MovieTicketRepo;

@Service
public class MovieTicketServiceImpl implements MovieTicketService {

	@Autowired
	private MovieTicketRepo movieTicketRepo;

	@Override
	public List<MovieTicket> getMovieTicketDetails() {
		List<MovieTicket> movieTicket = new ArrayList<MovieTicket>();
		movieTicket = this.movieTicketRepo.findAll();
		return movieTicket;
	}

	@Override
	public MovieTicket insertMovieTicketDetails(MovieTicket movieTicket) {
		return this.movieTicketRepo.save(movieTicket);
	}

	@Override
	public List<MovieTicket> sortTicket() {
		List<MovieTicket> movieTicket = new ArrayList<MovieTicket>();
		movieTicket = this.movieTicketRepo.findAll();
		Collections.sort(movieTicket, new Comparator<MovieTicket>() {

			@Override
			public int compare(MovieTicket movieTicket1, MovieTicket movieTicket2) {

				return (int) (movieTicket1.getTicketPrice() - movieTicket2.getTicketPrice());
			}

		});

		return movieTicket;
	}

}
