package com.mindtree.CollageUniversity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.CollageUniversity.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
