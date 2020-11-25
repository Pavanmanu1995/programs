package com.mindtree.libraryManagementSystem.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.libraryManagementSystem.entity.Book;
import com.mindtree.libraryManagementSystem.entity.Library;
import com.mindtree.libraryManagementSystem.repository.BookRepository;
import com.mindtree.libraryManagementSystem.repository.LibraryRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private LibraryRepository libraryRepository;

	

	@Override
	public Book insertBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Set<Book> getAllBooks(long bookId) {
		
		return libraryRepository.findById(bookId).get().getBookList();
	}

	@Override
	public void deleteOneBook(long bookId) {
		bookRepository.deleteById(bookId);
		
	}

	@Override
	public Book updateFinalBook(Book book) {
		
		return bookRepository.save(book);
	}
	

}

