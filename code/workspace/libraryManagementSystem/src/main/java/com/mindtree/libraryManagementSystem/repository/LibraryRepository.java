package com.mindtree.libraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.libraryManagementSystem.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
