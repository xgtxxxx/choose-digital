/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.book;

import java.util.List;

/**
 * @author Gavin
 *
 */
public class BookChart {
	private String displayTitle;	
	private List<Book> books;
	/**
	 * @return the displayTitle
	 */
	public String getDisplayTitle() {
		return displayTitle;
	}
	/**
	 * @param displayTitle the displayTitle to set
	 */
	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
