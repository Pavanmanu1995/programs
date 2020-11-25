package com.mindtree.doccareproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.doccareproject.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	Optional<Hospital> findByHospitalName(String hospitalName);

}
