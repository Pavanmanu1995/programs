package com.mindtree.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.hotelmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
