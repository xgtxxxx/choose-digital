/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.music;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;
import com.b2r.service.digital.choosedigital.domain.Required;
import com.b2r.service.digital.choosedigital.domain.RequiredType;

/**
 * @author Gavin
 *
 */
public class MusicDetailByIsrcRequest extends MusicRequest {
	@Required(type=RequiredType.PATH)
	private String isrc;
	@Required(type=RequiredType.PATH)
	private String country;
	private String hashedCustomerId;
	private String includeFutureReleases;
	private String tenantId;
	/**
	 * @return the isrc
	 */
	public String getIsrc() {
		return isrc;
	}
	/**
	 * @param isrc the isrc to set
	 */
	public void setIsrc(String isrc) {
		this.isrc = isrc;
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
	 * @return the hashedCustomerId
	 */
	public String getHashedCustomerId() {
		return hashedCustomerId;
	}
	/**
	 * @param hashedCustomerId the hashedCustomerId to set
	 */
	public void setHashedCustomerId(String hashedCustomerId) {
		this.hashedCustomerId = hashedCustomerId;
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
	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.ISRC;
	}
}
