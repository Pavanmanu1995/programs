package com.mindtree.doccareproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.doccareproject.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	Optional<Doctor> findByDoctorName(String doctorName);

}
