package com.mindtree.hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.hotelmanagement.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
