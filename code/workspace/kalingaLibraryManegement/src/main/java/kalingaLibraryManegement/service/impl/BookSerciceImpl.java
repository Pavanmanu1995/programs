package kalingaLibraryManegement.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kalingaLibraryManegement.entity.Book;
import kalingaLibraryManegement.repository.BookRepository;
import kalingaLibraryManegement.repository.LibraryRepository;
import kalingaLibraryManegement.service.BookService;

@Service
public class BookSerciceImpl implements BookService{
	@Autowired
	private BookRepository BookRepository;
	
	@Autowired
	private LibraryRepository LibraryRepository;

	@Override
	public Book insertBook(Book book) {

		return BookRepository.save(book);
	}

	@Override
	public Set<Book> getAllBooks(long bookId) {
		
		return LibraryRepository.findById(bookId).get().getBookList();
	}

	@Override
	public void deleteOneBook(long bookId) {
		BookRepository.deleteById(bookId);
		
	}

	@Override
	public Book updateFinalBook(Book book) {
		
		return BookRepository.save(book);
	}
	

}
