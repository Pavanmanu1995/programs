package com.mindtree.ticketbooking.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.dto.LogInDto;
import com.mindtree.ticketbooking.entities.Booking;
import com.mindtree.ticketbooking.entities.User;
import com.mindtree.ticketbooking.repository.UserRepository;
import com.mindtree.ticketbooking.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getallUser() {
		return userRepo.findAll();
	}

	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	@Override
	public boolean isUser(LogInDto login) {
		List<User> users= userRepo.findAll();
		
		Optional<User> user=users.stream().filter(e->e.getEmail()
				.equals(login.getEmail())
				&&e.getPassword().equals(login.getPassword())).findAny();
		if(user.isPresent())
			return true;
		return false;
	}

	@Override
	public List<Booking> getBooking(long id) {
		return userRepo.findById(id).get().getBookings();
	}

		
		
	}


