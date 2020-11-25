package kalingaLibraryManegement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	private String bookName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Library library;

	public Book(long bookId, String bookName, Library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.library = library;
	}

	public Book() {
		super();
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
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

}
