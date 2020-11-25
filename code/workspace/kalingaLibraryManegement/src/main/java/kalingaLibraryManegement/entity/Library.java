package kalingaLibraryManegement.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long libraryId;
	
	@Column(unique = true)
	private String libraryName;
	
	@JsonIgnoreProperties("library")
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "library",fetch = FetchType.LAZY)
	private Set<Book> bookList;

	public Library(long libraryId, String libraryName, Set<Book> bookList) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.bookList = bookList;
	}

	public Library() {
		super();
	}

	public long getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(long libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public Set<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
		
	
}
