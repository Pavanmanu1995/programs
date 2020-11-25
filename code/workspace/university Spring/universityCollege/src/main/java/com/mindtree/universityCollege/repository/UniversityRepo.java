package com.mindtree.universityCollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.universityCollege.Entity.University;

@Repository
public interface UniversityRepo extends JpaRepository<University, Integer> {

}
