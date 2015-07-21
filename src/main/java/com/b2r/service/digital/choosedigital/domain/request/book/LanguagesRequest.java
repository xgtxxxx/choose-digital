/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.book;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;

/**
 * @author Gavin
 *
 */
public class LanguagesRequest extends BookRequest {
	private String tenantId;

	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.LANGUAGES;
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
}
