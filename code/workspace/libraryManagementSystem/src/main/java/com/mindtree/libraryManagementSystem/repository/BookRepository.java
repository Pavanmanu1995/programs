package com.mindtree.libraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.libraryManagementSystem.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
