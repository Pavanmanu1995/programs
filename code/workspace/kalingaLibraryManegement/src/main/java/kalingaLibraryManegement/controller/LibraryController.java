package kalingaLibraryManegement.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kalingaLibraryManegement.entity.Book;
import kalingaLibraryManegement.entity.Library;
import kalingaLibraryManegement.service.BookService;
import kalingaLibraryManegement.service.LibraryService;



@Controller
@RequestMapping("/")
public class LibraryController {
	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private BookService bookService;

	static Library libraryBook=new Library();
	
	@RequestMapping("/")
	public ModelAndView homePage(ModelAndView mav) {
		List<Library> libList=libraryService.getAllLibraryList();
		mav.addObject("libList", libList);
		mav.setViewName("index");;
		return mav;
	}
	
	@RequestMapping("/update/{libraryId}")
	public ModelAndView updateLibrary(@PathVariable(name = "libraryId") long libraryId) {
		ModelAndView mav=new ModelAndView("update_lib");
		Library library=libraryService.getById(libraryId);
		mav.addObject("library", library);
		return mav;
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
		public String SaveLibrary(@ModelAttribute("library") Library library) {
	
		libraryService.insertDataLibrary(library);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/add")
	public String newLibraryAdd(Model model) {
		Library library=new Library();
		model.addAttribute("library", library);
		return "add_lib";
	}
	
	@RequestMapping("/delete")
	public String deleteLibrary(@RequestParam(name = "libraryId") long libraryId) {
		libraryService.deleteLibraryById(libraryId);
		return "redirect:/";
	}
	
	@RequestMapping("/details/{libraryId}")
	public ModelAndView librayDetails(@PathVariable("libraryId") long libraryId,ModelAndView mav) {
		Library library=libraryService.librayDetails(libraryId);
		Set<Book> books=library.getBookList();
		libraryBook=library;
		mav.setViewName("lib_details");
		mav.addObject("books", books);
		return mav;
	}
	@RequestMapping("/remove")
	public ModelAndView removeLibrary(Model model) {
		List<Library> libList=libraryService.getAllLibraryList();
		ModelAndView mav=new ModelAndView("delete");
		mav.addObject("libist", libList);
		return mav;
	}
	@RequestMapping(value = "/save/{libraryId}",method = RequestMethod.POST)
	public String updateLibrary(@ModelAttribute("library") Library library,@PathVariable long libraryId) {
   library.setLibraryId(libraryId);
	libraryService.insertDataLibrary(library);
	return "redirect:/";
}
}
