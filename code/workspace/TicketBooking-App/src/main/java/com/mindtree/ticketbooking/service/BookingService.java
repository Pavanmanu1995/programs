package com.mindtree.ticketbooking.service;

import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.entities.Train;

@Service
public interface BookingService {
	void saveBooking(long userId, Train train);
}
