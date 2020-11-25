package com.mindtree.collegeUniversities.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeUniversities.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {


	Optional<University> findByUniversityName(String universityName);

}
