package kalingaLibraryManegement.service;

import java.util.List;
import java.util.Set;

import kalingaLibraryManegement.entity.Book;
import kalingaLibraryManegement.entity.Library;


public interface LibraryService {
	public List<Library> getAllLibraryList();

	public Library getById(long libraryId);

	public Library insertDataLibrary(Library library);

	public Library deleteLibraryById(long libraryId);

	public Library librayDetails(long libraryId);
}
