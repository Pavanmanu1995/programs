package com.mindtree.hotelmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hotelmanagement.entity.User;
import com.mindtree.hotelmanagement.service.UserService;
import com.mindtree.hotelmanagement.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/get/user/details")
	public List<User> getUserDetails()
	{
		List<User> user=new ArrayList<User>();
		user=this.userService.getUserDetails();
		return user;
	}
	
	@PostMapping("/add/data/to/user")
	public User insertDataToUser(@RequestBody User user)
	{
		User user1=null;
		user1=this.userService.insertDataToUser(user);
				return user1;
		
	}

}
