/**
 * 
 */
package com.nagarro.library.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.library.model.Book;
import com.nagarro.library.model.User;
import com.nagarro.library.service.BookService;
import com.nagarro.library.service.UserService;

/**
 * @author mohammedmaaz
 *
 */
@Controller
public class Bookcontroller {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mvObj = new ModelAndView("home"); 
		List<Book> bookList = bookService.getAllBook();
		List<User> userList = userService.getAllUsers();
		mvObj.addObject("userList",userList);
		mvObj.addObject("bookList",bookList);
		return mvObj;	
	}
	
	@GetMapping("/addBook")
	public String Bookinsert(ModelMap model)
	{
		return new String("addBook");
	}
	
	@PostMapping("/insert")
	public ModelAndView insertBookDetails(@Validated Book books,HttpSession session)
	{
	ModelAndView mvObj = new ModelAndView("home");
    bookService.createBook(books);
    System.out.println(books.toString());
    List<Book> bookList = bookService.getAllBook();
    session.setAttribute("msg", "Book Added successfully");
    mvObj.addObject("bookList", bookList);
    mvObj.setViewName("home");
    return mvObj;
		
	}
	  @PostMapping("/update")
	    public ModelAndView update(Book books) {
	        ModelAndView mvObj = new ModelAndView("home");
	        bookService.updateBook(books);
	        List<Book> bookList = bookService.getAllBook();
	        mvObj.addObject("bookList", bookList);
	        mvObj.setViewName("home");
	        return mvObj;
	    }
	  
	  @PostMapping("/editview")
	    public ModelAndView editBookDetails(@RequestParam int id) {
	        ModelAndView mv = new ModelAndView();
	        Optional<Book> obj = bookService.getBook(id);
	        Book book = obj.get();
	        mv.addObject("bookObj", book);
	        mv.setViewName("updateBook");
	        return mv;
	    }

	    @PostMapping("/delete")
	    public ModelAndView delete(@RequestParam int id) {
	        ModelAndView mvObj = new ModelAndView();
	        bookService.deleteBook(id);
	        List<Book> bookList = bookService.getAllBook();
	        mvObj.addObject("bookList", bookList);
	        mvObj.setViewName("home");
	        return mvObj;

	    }

}
