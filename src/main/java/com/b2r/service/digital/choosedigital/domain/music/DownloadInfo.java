/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

/**
 * @author Gavin
 *
 */
public class DownloadInfo {
	private String url;
	private String title;
	private String remaining;
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the remaining
	 */
	public String getRemaining() {
		return remaining;
	}
	/**
	 * @param remaining the remaining to set
	 */
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}
}
