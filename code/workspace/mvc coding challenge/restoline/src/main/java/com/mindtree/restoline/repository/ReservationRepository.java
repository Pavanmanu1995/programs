package com.mindtree.restoline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.restoline.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
