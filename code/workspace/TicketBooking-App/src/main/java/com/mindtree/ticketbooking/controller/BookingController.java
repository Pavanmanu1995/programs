package com.mindtree.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.ticketbooking.entities.Train;
import com.mindtree.ticketbooking.entities.User;
import com.mindtree.ticketbooking.service.BookingService;
import com.mindtree.ticketbooking.service.TrainService;
import com.mindtree.ticketbooking.service.UserService;

@Controller
public class BookingController {
	@Autowired
	private BookingService bookingService;
	@Autowired
	private TrainService trainService;
	@Autowired
	private UserService userService;
	
	private Train train;
	@RequestMapping("bookTrain")
	public ModelAndView bookingTrain(@RequestParam Long id) {
		ModelAndView mav=new ModelAndView("bookticket");
		train=trainService.getTrains(id);
		List<User> userList=userService.getallUser();
		mav.addObject("userList", userList);
		return mav;
	}
	@RequestMapping("saveBooking")
	public String saveBooking(@RequestParam("userId") long userId) {
		
		bookingService.saveBooking(userId,train);
		return "bookingSuccess";
		
	}
}
