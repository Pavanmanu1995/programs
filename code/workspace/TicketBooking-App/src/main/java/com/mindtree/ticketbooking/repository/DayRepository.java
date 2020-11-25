package com.mindtree.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ticketbooking.entities.Booking;
import com.mindtree.ticketbooking.entities.Day;

@Repository
public interface DayRepository extends JpaRepository<Day,Long>{

}
