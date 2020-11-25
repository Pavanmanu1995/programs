package com.mindtree.ticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.ticketbooking.dto.ErrorDto;
import com.mindtree.ticketbooking.entities.Booking;
import com.mindtree.ticketbooking.entities.User;
import com.mindtree.ticketbooking.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("register")
	public ModelAndView newUser() {
		ModelAndView mav = new ModelAndView("register");
		User user = new User();
		mav.addObject("user", user);
		return mav;

	}

	@RequestMapping("saveUser")
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/";

	}

	@RequestMapping("view")
	public ModelAndView showHistory() {
		ModelAndView mav = new ModelAndView("showHistory");
		mav.addObject("users", userService.getallUser());
		return mav;
	}

	@RequestMapping("getHistory")
	public ModelAndView getBooking(@RequestParam("userId") long id) {
		ModelAndView mav = new ModelAndView("showHistory");
		mav.addObject("users", userService.getallUser());
		List<Booking> blist = userService.getBooking(id);
		if (blist.isEmpty())
			mav.addObject("error", new ErrorDto("this user got no booking"));
		else
			mav.addObject("blist", blist);
		return mav;

	}

}
