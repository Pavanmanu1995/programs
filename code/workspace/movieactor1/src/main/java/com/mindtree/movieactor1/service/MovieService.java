package com.mindtree.movieactor1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mindtree.movieactor1.entity.Movie;

@Service
public interface MovieService {

	List<Movie> getMovieDetails();

	Movie insertDataToMovie(Movie movie);

	Optional<Movie> getMovieByActorId(long actorId);

	List<Movie> movieGreaterThan(int i);

}
