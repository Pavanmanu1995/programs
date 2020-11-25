package kalingaLibraryManegement.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kalingaLibraryManegement.entity.Book;
import kalingaLibraryManegement.service.BookService;
import kalingaLibraryManegement.service.LibraryService;

@Controller
public class BookController {

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
