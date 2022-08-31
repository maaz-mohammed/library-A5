/**
 * 
 */
package com.nagarro.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.library.exceptions.ResourceNotFoundExceptions;
import com.nagarro.library.model.Book;
import com.nagarro.library.repository.BookRepository;

/**
 * @author mohammedmaaz
 *
 */
@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBook(){
		//for all books
		List<Book> books;
		books = bookRepository.findAll();
		return books;
	}
	
	//for getting 1 book using Id
	public Optional<Book> getBook(int Id)
	{
		return bookRepository.findById(Id);//.orElseThrow(()-> new ResourceNotFoundExceptions("Book","Id",Id));
	}
	
	
	//for updating a book
	public void updateBook(Book book) {
		Optional<Book> bookTemp= bookRepository.findById(book.getBookCode());
		if(bookTemp.isPresent())
		{
			Book changeBook = bookTemp.get();
			changeBook.setAuthorName(book.getAuthorName());
			changeBook.setBookName(book.getBookName());
			changeBook.setDate(book.getAuthorName());			
		}
	}
		
	//delete a book
	public void deleteBook(int Id)
	{
		bookRepository.deleteById(Id);
	}
	
	//saving a book
	public void createBook(Book books)
	{
		bookRepository.save(books);
	}
		
}
