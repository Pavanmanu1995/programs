package com.mindtree.movieBooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.movieBooking.entity.MovieTicket;
@Repository
public interface MovieTicketRepository extends JpaRepository<MovieTicket, Long> {

	Optional<MovieTicket> findByMovieName(String movieName);

}
