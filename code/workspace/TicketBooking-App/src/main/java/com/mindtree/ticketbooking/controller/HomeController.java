package com.mindtree.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.ticketbooking.dto.ErrorDto;
import com.mindtree.ticketbooking.dto.LogInDto;
import com.mindtree.ticketbooking.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@RequestMapping("homepage")
	public ModelAndView goHome() {
		ModelAndView mav=new ModelAndView("homepage");
		return mav;
	}
	
	
	@RequestMapping("/")
   public String getLogIn(Model model) {
	   LogInDto login=new LogInDto();
	   model.addAttribute("login", login);
	return "login";
   }
	
	@RequestMapping("login")
	   public String gohome(@ModelAttribute LogInDto log,Model model) {
		boolean flag=userService.isUser(log);
		if(flag)
			return "homepage";
		else {
			LogInDto login=new LogInDto();
		   model.addAttribute("login", login);
		   model.addAttribute("error", new ErrorDto("invalid user and password"));
			return "login";
		}
	   }
}
