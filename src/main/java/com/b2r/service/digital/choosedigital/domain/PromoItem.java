/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

/**
 * @author Gavin
 *
 */
public class PromoItem {
	private String name;
	private int importance;	
	private String bannerUrl;
	private String noSchemeBannerUrl;
	private String altText;
	private boolean exclusive;
	private String linkUrl;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the importance
	 */
	public int getImportance() {
		return importance;
	}
	/**
	 * @param importance the importance to set
	 */
	public void setImportance(int importance) {
		this.importance = importance;
	}
	/**
	 * @return the bannerUrl
	 */
	public String getBannerUrl() {
		return bannerUrl;
	}
	/**
	 * @param bannerUrl the bannerUrl to set
	 */
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	/**
	 * @return the noSchemeBannerUrl
	 */
	public String getNoSchemeBannerUrl() {
		return noSchemeBannerUrl;
	}
	/**
	 * @param noSchemeBannerUrl the noSchemeBannerUrl to set
	 */
	public void setNoSchemeBannerUrl(String noSchemeBannerUrl) {
		this.noSchemeBannerUrl = noSchemeBannerUrl;
	}
	/**
	 * @return the altText
	 */
	public String getAltText() {
		return altText;
	}
	/**
	 * @param altText the altText to set
	 */
	public void setAltText(String altText) {
		this.altText = altText;
	}
	/**
	 * @return the exclusive
	 */
	public boolean isExclusive() {
		return exclusive;
	}
	/**
	 * @param exclusive the exclusive to set
	 */
	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}
	/**
	 * @return the linkUrl
	 */
	public String getLinkUrl() {
		return linkUrl;
	}
	/**
	 * @param linkUrl the linkUrl to set
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
}
