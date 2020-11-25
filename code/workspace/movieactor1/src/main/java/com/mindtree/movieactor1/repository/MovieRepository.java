package com.mindtree.movieactor1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.movieactor1.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
