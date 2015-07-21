/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import java.util.List;

/**
 * @author Gavin
 *
 */
public class MusicChart {
	private String displayTitle;
	private List<Music> releases;
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
