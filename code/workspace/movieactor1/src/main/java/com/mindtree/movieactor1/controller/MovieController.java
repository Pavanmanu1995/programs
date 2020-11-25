package com.mindtree.movieactor1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.movieactor1.entity.Movie;
import com.mindtree.movieactor1.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movie/choice")
	public String choice()
	{
		System.out.println("welcome");
		return "this is movie";
	}
	
	@GetMapping("/get/movie/details")
	public List<Movie> getMovieDetails()
	{
		List<Movie> movie=new ArrayList<Movie>();
		movie=this.movieService.getMovieDetails();
		return movie;
	}
	
	@PostMapping("/insert/data/to/movie")
	public Movie insertDataToMovie(@RequestBody Movie movie)
	{
		Movie movie1=null;
		movie1=this.movieService.insertDataToMovie(movie);
		return movie1;
		
	}

	@GetMapping("/list/movie/of/perticular/actor/{id}")
	public Optional<Movie> getMovieByActorId(@PathVariable long movieId)
	{
		return this.movieService.getMovieByActorId(movieId);
	}
	
	@GetMapping("list/movies/with/budget/greater/than/100000")
	public List<Movie> movieGreaterThan()
	{
		List<Movie> movie=new ArrayList<Movie>();
		movie=this.movieService.movieGreaterThan(100000);
		return movie;
	}
	
}
