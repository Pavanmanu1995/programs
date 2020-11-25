package com.mindtree.collegeUniversity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.collegeUniversity.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}