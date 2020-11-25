package com.mindtree.ticketbooking.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.ticketbooking.entities.Train;


@Repository
public interface TrainRepository extends JpaRepository<Train,Long>{

	
}
