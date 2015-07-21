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
public class MusicCancelOrderRequest extends MusicRequest {
	@Required
	private String orderId;	
	@Required
	private String customerId;
	private String tenantId;
	private String cancelTransactionId;
	@Required
	private String authentication;
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
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	 * @return the cancelTransactionId
	 */
	public String getCancelTransactionId() {
		return cancelTransactionId;
	}
	/**
	 * @param cancelTransactionId the cancelTransactionId to set
	 */
	public void setCancelTransactionId(String cancelTransactionId) {
		this.cancelTransactionId = cancelTransactionId;
	}
	/**
	 * @return the authentication
	 */
	public String getAuthentication() {
		return authentication;
	}
	/**
	 * @param authentication the authentication to set
	 */
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.CANCEL;
	}
}
