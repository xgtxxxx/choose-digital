/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.book;

import java.util.Date;
import java.util.List;

/**
 * @author Gavin
 *
 */
public class Book {
	private String cdin;	
	private List<String> creators;	
	private String formatType;	
	private String isbn;	
	private String title;	
	private String sanitizedTitle;
	private String coverImage;
	private String thumbnailImage;
	private String shortDescription;	
	private String fullDescription;	
	private String publisher;
	private String imprint;	
	private List<String> languages;	
	private String series;
	private String edition;
	private List<String> subjects;
	private String fileSize;
	private String retailPrice;
	private Date availableDate;
	private String subtitle;
	private List<String> digitalRights;
	private String contentDuration;	
	private String numberOfParts;
	private String digitalExcerpt;
	private String available;
	private Date purchaseDate;	
	private String orderId;
	/**
	 * @return the cdin
	 */
	public String getCdin() {
		return cdin;
	}
	/**
	 * @param cdin the cdin to set
	 */
	public void setCdin(String cdin) {
		this.cdin = cdin;
	}
	/**
	 * @return the creators
	 */
	public List<String> getCreators() {
		return creators;
	}
	/**
	 * @param creators the creators to set
	 */
	public void setCreators(List<String> creators) {
		this.creators = creators;
	}
	/**
	 * @return the formatType
	 */
	public String getFormatType() {
		return formatType;
	}
	/**
	 * @param formatType the formatType to set
	 */
	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the sanitizedTitle
	 */
	public String getSanitizedTitle() {
		return sanitizedTitle;
	}
	/**
	 * @param sanitizedTitle the sanitizedTitle to set
	 */
	public void setSanitizedTitle(String sanitizedTitle) {
		this.sanitizedTitle = sanitizedTitle;
	}
	/**
	 * @return the coverImage
	 */
	public String getCoverImage() {
		return coverImage;
	}
	/**
	 * @param coverImage the coverImage to set
	 */
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	/**
	 * @return the thumbnailImage
	 */
	public String getThumbnailImage() {
		return thumbnailImage;
	}
	/**
	 * @param thumbnailImage the thumbnailImage to set
	 */
	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}
	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}
	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	/**
	 * @return the fullDescription
	 */
	public String getFullDescription() {
		return fullDescription;
	}
	/**
	 * @param fullDescription the fullDescription to set
	 */
	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the imprint
	 */
	public String getImprint() {
		return imprint;
	}
	/**
	 * @param imprint the imprint to set
	 */
	public void setImprint(String imprint) {
		this.imprint = imprint;
	}
	/**
	 * @return the languages
	 */
	public List<String> getLanguages() {
		return languages;
	}
	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}
	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}
	/**
	 * @return the subjects
	 */
	public List<String> getSubjects() {
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	/**
	 * @return the fileSize
	 */
	public String getFileSize() {
		return fileSize;
	}
	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	/**
	 * @return the retailPrice
	 */
	public String getRetailPrice() {
		return retailPrice;
	}
	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	/**
	 * @return the availableDate
	 */
	public Date getAvailableDate() {
		return availableDate;
	}
	/**
	 * @param availableDate the availableDate to set
	 */
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	/**
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the digitalRights
	 */
	public List<String> getDigitalRights() {
		return digitalRights;
	}
	/**
	 * @param digitalRights the digitalRights to set
	 */
	public void setDigitalRights(List<String> digitalRights) {
		this.digitalRights = digitalRights;
	}
	/**
	 * @return the contentDuration
	 */
	public String getContentDuration() {
		return contentDuration;
	}
	/**
	 * @param contentDuration the contentDuration to set
	 */
	public void setContentDuration(String contentDuration) {
		this.contentDuration = contentDuration;
	}
	/**
	 * @return the numberOfParts
	 */
	public String getNumberOfParts() {
		return numberOfParts;
	}
	/**
	 * @param numberOfParts the numberOfParts to set
	 */
	public void setNumberOfParts(String numberOfParts) {
		this.numberOfParts = numberOfParts;
	}
	/**
	 * @return the digitalExcerpt
	 */
	public String getDigitalExcerpt() {
		return digitalExcerpt;
	}
	/**
	 * @param digitalExcerpt the digitalExcerpt to set
	 */
	public void setDigitalExcerpt(String digitalExcerpt) {
		this.digitalExcerpt = digitalExcerpt;
	}
	/**
	 * @return the available
	 */
	public String getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(String available) {
		this.available = available;
	}
	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
