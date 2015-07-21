/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import java.util.List;

/**
 * @author Gavin
 *
 */
public class Component {
	private String componentNumber;
	private List<Release> trackReleases;
	/**
	 * @return the componentNumber
	 */
	public String getComponentNumber() {
		return componentNumber;
	}
	/**
	 * @param componentNumber the componentNumber to set
	 */
	public void setComponentNumber(String componentNumber) {
		this.componentNumber = componentNumber;
	}
	/**
	 * @return the trackReleases
	 */
	public List<Release> getTrackReleases() {
		return trackReleases;
	}
	/**
	 * @param trackReleases the trackReleases to set
	 */
	public void setTrackReleases(List<Release> trackReleases) {
		this.trackReleases = trackReleases;
	}
}
