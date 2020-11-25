package com.mindtree.ticketbooking.serviceimpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ticketbooking.entities.Booking;
import com.mindtree.ticketbooking.entities.Train;
import com.mindtree.ticketbooking.repository.BookingRepository;
import com.mindtree.ticketbooking.repository.UserRepository;
import com.mindtree.ticketbooking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepository bookingRepo;
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveBooking(long userId, Train train) {
		Booking book=new Booking();
		book.setUser(userRepo.findById(userId).get());
		book.setDate(LocalDate.now());
		book.setTrain(train);
		bookingRepo.save(book);
	}

}
