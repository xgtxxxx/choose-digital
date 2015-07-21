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
public class MusicPurchaseRequest extends MusicRequest {
	@Required
	private String cdin;
	@Required
	private Integer priceSold;
	@Required
	private Integer taxAmount;
	@Required
	private String customerId;
	private String externalMemberId;
	private String customerEmail;
	@Required
	private String customerPostalCode;	
	@Required
	private String customerCountryCode;
	private String promoCode;
	private String tenantId;
	private String transactionId;
	private String segment;
	private String tier;
	@Required
	private String authentication;
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
	 * @return the priceSold
	 */
	public Integer getPriceSold() {
		return priceSold;
	}
	/**
	 * @param priceSold the priceSold to set
	 */
	public void setPriceSold(Integer priceSold) {
		this.priceSold = priceSold;
	}
	/**
	 * @return the taxAmount
	 */
	public Integer getTaxAmount() {
		return taxAmount;
	}
	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Integer taxAmount) {
		this.taxAmount = taxAmount;
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
	 * @return the externalMemberId
	 */
	public String getExternalMemberId() {
		return externalMemberId;
	}
	/**
	 * @param externalMemberId the externalMemberId to set
	 */
	public void setExternalMemberId(String externalMemberId) {
		this.externalMemberId = externalMemberId;
	}
	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}
	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	/**
	 * @return the customerPostalCode
	 */
	public String getCustomerPostalCode() {
		return customerPostalCode;
	}
	/**
	 * @param customerPostalCode the customerPostalCode to set
	 */
	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}
	/**
	 * @return the customerCountryCode
	 */
	public String getCustomerCountryCode() {
		return customerCountryCode;
	}
	/**
	 * @param customerCountryCode the customerCountryCode to set
	 */
	public void setCustomerCountryCode(String customerCountryCode) {
		this.customerCountryCode = customerCountryCode;
	}
	/**
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}
	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
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
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the segment
	 */
	public String getSegment() {
		return segment;
	}
	/**
	 * @param segment the segment to set
	 */
	public void setSegment(String segment) {
		this.segment = segment;
	}
	/**
	 * @return the tier
	 */
	public String getTier() {
		return tier;
	}
	/**
	 * @param tier the tier to set
	 */
	public void setTier(String tier) {
		this.tier = tier;
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
		return DigitalMethod.PURCHASE;
	}
}
