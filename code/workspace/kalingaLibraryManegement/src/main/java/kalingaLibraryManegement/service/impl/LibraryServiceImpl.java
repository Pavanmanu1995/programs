package kalingaLibraryManegement.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kalingaLibraryManegement.entity.Book;
import kalingaLibraryManegement.entity.Library;
import kalingaLibraryManegement.repository.BookRepository;
import kalingaLibraryManegement.repository.LibraryRepository;
import kalingaLibraryManegement.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{

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
