package com.mindtree.libraryManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.libraryManagementSystem.entity.Book;
import com.mindtree.libraryManagementSystem.entity.Library;

@Service
public interface LibraryService {

	public List<Library> getAllLibraryList();

	public Library getById(long libraryId);

	public Library insertDataLibrary(Library library);

	public Library deleteLibraryById(long libraryId);

	public Library librayDetails(long libraryId);
	

}
