package com.mindtree.bookingportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookingportal.entity.BookingPortal;
import com.mindtree.bookingportal.entity.MovieTicket;

@Repository
public interface MovieTicketRepository extends JpaRepository<MovieTicket, Integer> {

	Optional<BookingPortal> findByMovieName(String movieName);

}
