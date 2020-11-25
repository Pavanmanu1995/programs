package com.mindtree.CollageUniversity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.CollageUniversity.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

}
