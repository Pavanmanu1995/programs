package com.mindtree.universityCollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.universityCollege.Entity.Collage;

@Repository
public interface CollageRepo extends JpaRepository<Collage, Integer> {

}
