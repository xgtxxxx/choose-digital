/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import java.util.List;

import com.b2r.service.digital.choosedigital.domain.Genre;

/**
 * @author Gavin
 *
 */
public class MusicSearchResult {
	private long numFound;	
	private long start;
	private String searchTerm;
	private List<Genre> genres;	
	private List<ReleaseType> releaseTypes;	
	private List<Music> releases;
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
	 * @return the genres
	 */
	public List<Genre> getGenres() {
		return genres;
	}
	/**
	 * @param genres the genres to set
	 */
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	/**
	 * @return the releaseTypes
	 */
	public List<ReleaseType> getReleaseTypes() {
		return releaseTypes;
	}
	/**
	 * @param releaseTypes the releaseTypes to set
	 */
	public void setReleaseTypes(List<ReleaseType> releaseTypes) {
		this.releaseTypes = releaseTypes;
	}
	/**
	 * @return the releases
	 */
	public List<Music> getReleases() {
		return releases;
	}
	/**
	 * @param releases the releases to set
	 */
	public void setReleases(List<Music> releases) {
		this.releases = releases;
	}
}
