package com.mindtree.libraryManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;

	private String bookName;
	@ManyToOne(fetch=FetchType.LAZY)
	private Library library;
	public Book() {
		super();
	}
	public Book(Long bookId, String bookName, Library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.library = library;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", library=" + library + "]";
	}
	
	
	

}
