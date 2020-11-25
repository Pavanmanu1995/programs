package com.mindtree.collegeUniversity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeUniversity.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

}
