package com.mindtree.libraryManagementSystem.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.libraryManagementSystem.entity.Book;

@Service
public interface BookService {

	

	public Book insertBook(Book book);

	public Set<Book> getAllBooks(long bookId);

	public void deleteOneBook(long bookId);

	public Book updateFinalBook(Book book);

}
