package com.mindtree.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ticketbooking.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
