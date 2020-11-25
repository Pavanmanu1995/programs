package com.mindtree.movieactor1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.movieactor1.entity.Movie;
import com.mindtree.movieactor1.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getMovieDetails() {
		List<Movie> movie=new ArrayList<Movie>();
		movie=this.movieRepository.findAll();
		
		return movie;
	}

	@Override
	public Movie insertDataToMovie(Movie movie) {
		Movie movie1=null;
		movie1=this.movieRepository.save(movie);
		return movie1;
	}

	@Override
	public Optional<Movie> getMovieByActorId(long actorId) {
		return this.movieRepository.findById(actorId);
	}

	@Override
	public List<Movie> movieGreaterThan(int i) {
		List<Movie> movie = this.movieRepository.findAll();
		List<Movie> movies = new ArrayList<Movie>();
		for (int j = 0; j < movie.size(); j++)
			if (movie.get(j).getBudget()>100000) {
				movies.add(movie.get(j));
			}
		return movies;
	}

}
