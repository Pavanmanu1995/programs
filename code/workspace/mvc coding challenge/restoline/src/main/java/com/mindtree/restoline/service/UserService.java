package com.mindtree.restoline.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.restoline.entity.User;

@Service
public interface UserService {

	boolean registerUser(User user);

	int checkUser(User user);

	Set<User> getAllUsers();

	User getUserById();


}
