package com.mindtree.libraryManagementSystem.entity;

import java.util.List;
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
	private Long libraryId;
	@Column(unique=true)
	private String libraryName;
	
	@JsonIgnoreProperties("library")
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="library")
	private Set<Book> bookList;

	public Library() {
		super();
	}

	public Library(Long libraryId, String libraryName, Set<Book> bookList) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.bookList = bookList;
	}

	public Long getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(Long libraryId) {
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

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", bookList=" + bookList + "]";
	}

	
	
	
	
	
	
	
	

}
