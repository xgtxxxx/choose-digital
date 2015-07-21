/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.book;

import java.util.List;

import com.b2r.service.digital.choosedigital.domain.Genre;

/**
 * @author Gavin
 *
 */
public class BookSearchResult {
	private long numFound;	
	private long start;
	private String searchTerm;
	private List<Genre> subjects;	
	private List<Genre> formatTypes;
	private List<Book> books;
	/**
	 * @return the numFound
	 */
	public long getNumFound() {
		return numFound;
	}
	/**
	 * @param numFound the numFound to set
	 */
	public void setNumFound(long numFound) {
		this.numFound = numFound;
	}
	/**
	 * @return the start
	 */
	public long getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(long start) {
		this.start = start;
	}
	/**
	 * @return the searchTerm
	 */
	public String getSearchTerm() {
		return searchTerm;
	}
	/**
	 * @param searchTerm the searchTerm to set
	 */
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	/**
	 * @return the subjects
	 */
	public List<Genre> getSubjects() {
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<Genre> subjects) {
		this.subjects = subjects;
	}
	/**
	 * @return the formatTypes
	 */
	public List<Genre> getFormatTypes() {
		return formatTypes;
	}
	/**
	 * @param formatTypes the formatTypes to set
	 */
	public void setFormatTypes(List<Genre> formatTypes) {
		this.formatTypes = formatTypes;
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
