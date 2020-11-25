package com.example.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Application.entity.BookingPortal;

@Repository
public interface BookingPortalRepo extends JpaRepository<BookingPortal, Integer> {

}
