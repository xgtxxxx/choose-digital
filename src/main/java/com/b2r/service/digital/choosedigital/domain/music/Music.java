/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import java.util.Date;
import java.util.List;

/**
 * @author Gavin
 *
 */
public class Music {
	private String cdin;
	private boolean albumOnly;
	private boolean available;
	private int downloadsAvailable;
	private String genre;
	private String displayTitle;	
	private String sanitizedDisplayTitle;
	private String icpn;	
	private String albumIcpn;	
	private String albumCdin;	
	private String albumDisplayTitle;	
	private String sanitizedAlbumDisplayTitle;	
	private String label;	
	private String copyright;	
	private String duration;	
	private boolean explicit;
	private String mainArtist;	
	private List<String> artist;
	private String mp3PreviewUrl;
    private String oggPreviewUrl;
	private String httpPreviewUrl;	
	private String streamPreviewUrl;	
	private String smallImageUrl;	
	private String mediumImageUrl;	
	private String largeImageUrl;	
	private int componentNumber;
	private int trackNumber;
	private int price;
	private Date preOrderDate;
	private Date startDate;
	private String bitrate;	
	private String releaseType;	
	private Date originalReleaseDate;	
	private int popularity;	
	private boolean multiArtistCompilation;
	private String currencyCode;	
	private Date purchaseDate;
	private String orderId;	
	private int remainingDownloads;
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
	 * @return the albumOnly
	 */
	public boolean isAlbumOnly() {
		return albumOnly;
	}
	/**
	 * @param albumOnly the albumOnly to set
	 */
	public void setAlbumOnly(boolean albumOnly) {
		this.albumOnly = albumOnly;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * @return the downloadsAvailable
	 */
	public int getDownloadsAvailable() {
		return downloadsAvailable;
	}
	/**
	 * @param downloadsAvailable the downloadsAvailable to set
	 */
	public void setDownloadsAvailable(int downloadsAvailable) {
		this.downloadsAvailable = downloadsAvailable;
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
	 * @return the sanitizedDisplayTitle
	 */
	public String getSanitizedDisplayTitle() {
		return sanitizedDisplayTitle;
	}
	/**
	 * @param sanitizedDisplayTitle the sanitizedDisplayTitle to set
	 */
	public void setSanitizedDisplayTitle(String sanitizedDisplayTitle) {
		this.sanitizedDisplayTitle = sanitizedDisplayTitle;
	}
	/**
	 * @return the icpn
	 */
	public String getIcpn() {
		return icpn;
	}
	/**
	 * @param icpn the icpn to set
	 */
	public void setIcpn(String icpn) {
		this.icpn = icpn;
	}
	/**
	 * @return the albumIcpn
	 */
	public String getAlbumIcpn() {
		return albumIcpn;
	}
	/**
	 * @param albumIcpn the albumIcpn to set
	 */
	public void setAlbumIcpn(String albumIcpn) {
		this.albumIcpn = albumIcpn;
	}
	/**
	 * @return the albumCdin
	 */
	public String getAlbumCdin() {
		return albumCdin;
	}
	/**
	 * @param albumCdin the albumCdin to set
	 */
	public void setAlbumCdin(String albumCdin) {
		this.albumCdin = albumCdin;
	}
	/**
	 * @return the albumDisplayTitle
	 */
	public String getAlbumDisplayTitle() {
		return albumDisplayTitle;
	}
	/**
	 * @param albumDisplayTitle the albumDisplayTitle to set
	 */
	public void setAlbumDisplayTitle(String albumDisplayTitle) {
		this.albumDisplayTitle = albumDisplayTitle;
	}
	/**
	 * @return the sanitizedAlbumDisplayTitle
	 */
	public String getSanitizedAlbumDisplayTitle() {
		return sanitizedAlbumDisplayTitle;
	}
	/**
	 * @param sanitizedAlbumDisplayTitle the sanitizedAlbumDisplayTitle to set
	 */
	public void setSanitizedAlbumDisplayTitle(String sanitizedAlbumDisplayTitle) {
		this.sanitizedAlbumDisplayTitle = sanitizedAlbumDisplayTitle;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}
	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * @return the explicit
	 */
	public boolean isExplicit() {
		return explicit;
	}
	/**
	 * @param explicit the explicit to set
	 */
	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}
	/**
	 * @return the mainArtist
	 */
	public String getMainArtist() {
		return mainArtist;
	}
	/**
	 * @param mainArtist the mainArtist to set
	 */
	public void setMainArtist(String mainArtist) {
		this.mainArtist = mainArtist;
	}
	/**
	 * @return the artist
	 */
	public List<String> getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(List<String> artist) {
		this.artist = artist;
	}
	/**
	 * @return the httpPreviewUrl
	 */
	public String getHttpPreviewUrl() {
		return httpPreviewUrl;
	}
	/**
	 * @param httpPreviewUrl the httpPreviewUrl to set
	 */
	public void setHttpPreviewUrl(String httpPreviewUrl) {
		this.httpPreviewUrl = httpPreviewUrl;
	}
	/**
	 * @return the streamPreviewUrl
	 */
	public String getStreamPreviewUrl() {
		return streamPreviewUrl;
	}
	/**
	 * @param streamPreviewUrl the streamPreviewUrl to set
	 */
	public void setStreamPreviewUrl(String streamPreviewUrl) {
		this.streamPreviewUrl = streamPreviewUrl;
	}
	/**
	 * @return the smallImageUrl
	 */
	public String getSmallImageUrl() {
		return smallImageUrl;
	}
	/**
	 * @param smallImageUrl the smallImageUrl to set
	 */
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	/**
	 * @return the mediumImageUrl
	 */
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}
	/**
	 * @param mediumImageUrl the mediumImageUrl to set
	 */
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	/**
	 * @return the largeImageUrl
	 */
	public String getLargeImageUrl() {
		return largeImageUrl;
	}
	/**
	 * @param largeImageUrl the largeImageUrl to set
	 */
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
	/**
	 * @return the componentNumber
	 */
	public int getComponentNumber() {
		return componentNumber;
	}
	/**
	 * @param componentNumber the componentNumber to set
	 */
	public void setComponentNumber(int componentNumber) {
		this.componentNumber = componentNumber;
	}
	/**
	 * @return the trackNumber
	 */
	public int getTrackNumber() {
		return trackNumber;
	}
	/**
	 * @param trackNumber the trackNumber to set
	 */
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the preOrderDate
	 */
	public Date getPreOrderDate() {
		return preOrderDate;
	}
	/**
	 * @param preOrderDate the preOrderDate to set
	 */
	public void setPreOrderDate(Date preOrderDate) {
		this.preOrderDate = preOrderDate;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the bitrate
	 */
	public String getBitrate() {
		return bitrate;
	}
	/**
	 * @param bitrate the bitrate to set
	 */
	public void setBitrate(String bitrate) {
		this.bitrate = bitrate;
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
	 * @return the originalReleaseDate
	 */
	public Date getOriginalReleaseDate() {
		return originalReleaseDate;
	}
	/**
	 * @param originalReleaseDate the originalReleaseDate to set
	 */
	public void setOriginalReleaseDate(Date originalReleaseDate) {
		this.originalReleaseDate = originalReleaseDate;
	}
	/**
	 * @return the popularity
	 */
	public int getPopularity() {
		return popularity;
	}
	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	/**
	 * @return the multiArtistCompilation
	 */
	public boolean isMultiArtistCompilation() {
		return multiArtistCompilation;
	}
	/**
	 * @param multiArtistCompilation the multiArtistCompilation to set
	 */
	public void setMultiArtistCompilation(boolean multiArtistCompilation) {
		this.multiArtistCompilation = multiArtistCompilation;
	}
	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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
	/**
	 * @return the remainingDownloads
	 */
	public int getRemainingDownloads() {
		return remainingDownloads;
	}
	/**
	 * @param remainingDownloads the remainingDownloads to set
	 */
	public void setRemainingDownloads(int remainingDownloads) {
		this.remainingDownloads = remainingDownloads;
	}
	/**
	 * @return the mp3PreviewUrl
	 */
	public String getMp3PreviewUrl() {
		return mp3PreviewUrl;
	}
	/**
	 * @param mp3PreviewUrl the mp3PreviewUrl to set
	 */
	public void setMp3PreviewUrl(String mp3PreviewUrl) {
		this.mp3PreviewUrl = mp3PreviewUrl;
	}
	/**
	 * @return the oggPreviewUrl
	 */
	public String getOggPreviewUrl() {
		return oggPreviewUrl;
	}
	/**
	 * @param oggPreviewUrl the oggPreviewUrl to set
	 */
	public void setOggPreviewUrl(String oggPreviewUrl) {
		this.oggPreviewUrl = oggPreviewUrl;
	}
}
