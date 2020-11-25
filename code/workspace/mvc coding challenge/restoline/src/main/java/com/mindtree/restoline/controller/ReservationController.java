package com.mindtree.restoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mindtree.restoline.service.ReservationService;
import com.mindtree.restoline.service.RestaurantService;
import com.mindtree.restoline.service.UserService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private RestaurantService restaurantSevice;
	
	@Autowired
	private UserService userService;

}
