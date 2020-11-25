package com.mindtree.ticketbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.dto.LogInDto;
import com.mindtree.ticketbooking.entities.Booking;
import com.mindtree.ticketbooking.entities.User;


@Service
public interface UserService {
	List<User> getallUser();

	void saveUser(User user);

	boolean isUser(LogInDto login);

	List<Booking> getBooking(long id);
}
