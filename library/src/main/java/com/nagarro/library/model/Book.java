/**
 * 
 */
package com.nagarro.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author mohammedmaaz
 *
 */
@Entity
@Component
public class Book {
	@Id
	private int bookCode;
	private String bookName;
	private String authorName;
	private String date;
	/**
	 * @return the bookId
	 */
	public int getBookCode() {
		return bookCode;
	}
	/**
	 * @param bookCode the bookCode to set
	 */
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
}
