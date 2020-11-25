package com.mindtree.hotelmanagement.service;

import java.util.List;

import com.mindtree.hotelmanagement.entity.User;

public interface UserService {

	List<User> getUserDetails();

	User insertDataToUser(User user);

}
