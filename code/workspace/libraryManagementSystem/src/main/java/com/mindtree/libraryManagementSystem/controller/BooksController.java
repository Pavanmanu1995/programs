package com.mindtree.libraryManagementSystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.libraryManagementSystem.entity.Book;
import com.mindtree.libraryManagementSystem.entity.Library;
import com.mindtree.libraryManagementSystem.service.BookService;
import com.mindtree.libraryManagementSystem.service.LibraryService;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private LibraryService libraryService; 
	
	
	@GetMapping(path = "/gotobook")
	public ModelAndView sendBookHome(ModelAndView mav) {
		mav.setViewName("add_book");
		mav.addObject("book", new Book());
		return mav;
	}
	
	@RequestMapping(value = "/savebook",method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") Book book) {
		book.setLibrary(LibraryController.libraryBook);
		bookService.insertBook(book);
		return "lib_details";
	}
	
	@RequestMapping("/details/deleteone")
	public ModelAndView deleteBook(ModelAndView mav) {
		mav.setViewName("book_drop_down");
		long libraryId=LibraryController.libraryBook.getLibraryId();
		Set<Book> list=bookService.getAllBooks(libraryId);
		mav.addObject("bookList", list);
		return mav;
	}

	@RequestMapping("/deletebook")
	public String detelePerticuler(@RequestParam(name = "bookId") long bookId) {
		bookService.deleteOneBook(bookId);
		return "redirect:/";

	}
	@RequestMapping("/details/updatebook")
	public ModelAndView updatePage(ModelAndView mav) {
		mav.setViewName("book_update_page");
		long libraryId=LibraryController.libraryBook.getLibraryId();
		Set<Book> list=bookService.getAllBooks(libraryId);
		mav.addObject("bookList",list);
		return mav;
	}

	@RequestMapping("/updatebooknew")
	public ModelAndView updateBook(@RequestParam(name = "bookId")long bookId ,ModelAndView mav) {
		Book bookupdate=new Book();
		bookupdate.setBookId(bookId);
		mav.setViewName("book_update_page_2");
		mav.addObject("bookupdate", bookupdate);
		return mav;
	}
	@PostMapping("/updatenewbook/{bookId}")
	public String finalUpdateBook(@ModelAttribute("bookupdate") Book book,@PathVariable long bookId) {
		book.setLibrary(LibraryController.libraryBook);		
		bookService.insertBook(book);
		return"lib_details";
	}
}
