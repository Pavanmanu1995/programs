package com.mindtree.restoline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.restoline.dto.ResponseBodys;
import com.mindtree.restoline.entity.Restaurant;
import com.mindtree.restoline.exception.RestoLineAppException;
import com.mindtree.restoline.service.ReservationService;
import com.mindtree.restoline.service.RestaurantService;
import com.mindtree.restoline.service.UserService;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@ResponseBody
	@PostMapping("/addRestaurant")
	public ResponseEntity<?> addRestaurant(@RequestBody Restaurant restaurant) throws RestoLineAppException {
		return new ResponseEntity<ResponseBodys<Restaurant>>(new ResponseBodys<Restaurant>(
				restaurantService.addRestaurant(restaurant), null, "Resturant Added", true), HttpStatus.OK);
	}
	
	
	
	@RequestMapping("/restaurants")
	public String getAllRestaurant(Model model) {
		model.addAttribute("restaurantlist", restaurantService.getAllRestaurant());
		return "show-restaurants-page";
	}

	

}
