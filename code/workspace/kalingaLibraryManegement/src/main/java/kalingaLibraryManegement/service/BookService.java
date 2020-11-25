package kalingaLibraryManegement.service;

import java.util.Set;

import kalingaLibraryManegement.entity.Book;

public interface BookService {

	public Book insertBook(Book book);

	public Set<Book> getAllBooks(long bookId);

	public void deleteOneBook(long bookId);

	public Book updateFinalBook(Book book);

}
