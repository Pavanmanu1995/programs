package com.mindtree.libraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.libraryManagementSystem.entity.Book;
import com.mindtree.libraryManagementSystem.entity.Library;
import com.mindtree.libraryManagementSystem.repository.BookRepository;
import com.mindtree.libraryManagementSystem.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<Library> getAllLibraryList() {
		
		return libraryRepository.findAll();
	}

	@Override
	public Library getById(long libraryId) {
		return libraryRepository.findById(libraryId).get();
	}

	@Override
	public Library insertDataLibrary(Library library) {
		
		return libraryRepository.save(library);
	}

	@Override
	public Library deleteLibraryById(long libraryId) {
		 libraryRepository.deleteById(libraryId);
		 return null;
		
	}

	@Override
	public Library librayDetails(long libraryId) {
		return libraryRepository.findById(libraryId).get();
	}
}
