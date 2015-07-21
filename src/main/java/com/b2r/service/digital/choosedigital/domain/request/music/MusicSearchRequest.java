/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.music;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;
import com.b2r.service.digital.choosedigital.domain.Required;

/**
 * @author Gavin
 *
 */
public class MusicSearchRequest extends MusicRequest {
	@Required
	private String term;
	@Required
	private String country;
	private String artist;
	private String genre;
	private Integer rows;
	private Integer start;
	private String releaseType;
	private String includeFutureReleases;
	private String tenantId;
	private String sort;
	private Integer priceLow;
	private Integer priceHigh;
	/**
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}
	/**
	 * @param term the term to set
	 */
	public void setTerm(String term) {
		this.term = term;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	/**
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}
	/**
	 * @return the releaseType
	 */
	public String getReleaseType() {
		return releaseType;
	}
	/**
	 * @param releaseType the releaseType to set
	 */
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}
	/**
	 * @return the includeFutureReleases
	 */
	public String getIncludeFutureReleases() {
		return includeFutureReleases;
	}
	/**
	 * @param includeFutureReleases the includeFutureReleases to set
	 */
	public void setIncludeFutureReleases(String includeFutureReleases) {
		this.includeFutureReleases = includeFutureReleases;
	}
	/**
	 * @return the tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}
	/**
	 * @param tenantId the tenantId to set
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	/**
	 * @return the priceLow
	 */
	public Integer getPriceLow() {
		return priceLow;
	}
	/**
	 * @param priceLow the priceLow to set
	 */
	public void setPriceLow(Integer priceLow) {
		this.priceLow = priceLow;
	}
	/**
	 * @return the priceHigh
	 */
	public Integer getPriceHigh() {
		return priceHigh;
	}
	/**
	 * @param priceHigh the priceHigh to set
	 */
	public void setPriceHigh(Integer priceHigh) {
		this.priceHigh = priceHigh;
	}
	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.SEARCH;
	}
}
