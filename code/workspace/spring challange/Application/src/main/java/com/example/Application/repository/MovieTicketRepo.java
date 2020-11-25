package com.example.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Application.entity.MovieTicket;

@Repository
public interface MovieTicketRepo extends JpaRepository<MovieTicket, Integer> {

}
