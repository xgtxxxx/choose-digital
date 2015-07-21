/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.book;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;
import com.b2r.service.digital.choosedigital.domain.Required;
import com.b2r.service.digital.choosedigital.domain.RequiredType;

/**
 * @author Gavin
 *
 */
public class BookDownloadRequest extends BookRequest{
	@Required(type=RequiredType.PATH)
	private String cdin;
	@Required(type=RequiredType.PATH)
	private String hashedCustomerId;
	@Required(type=RequiredType.PATH)
	private String country;
	private String tenantId;
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
		return DigitalMethod.DOWNLOAD;
	}
}
