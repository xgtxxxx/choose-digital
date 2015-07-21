/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.book;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;
import com.b2r.service.digital.choosedigital.domain.Required;

/**
 * @author Gavin
 *
 */
public class BookPurchaseRequest extends BookRequest{
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
	private String customerFirstName;
	@Required
	private String customerLastName;
	private String customerStreetAddress1;	
	private String customerStreetAddress2;
	@Required
	private String customerCity;
	@Required
	private String customerRegionCode;
	@Required
	private String customerPostalCode;
	private String customerPlus4;	
	@Required
	private String customerCountryCode;
	@Required
	private String errorUrl;
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
	 * @return the customerFirstName
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	/**
	 * @param customerFirstName the customerFirstName to set
	 */
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	/**
	 * @return the customerLastName
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}
	/**
	 * @param customerLastName the customerLastName to set
	 */
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	/**
	 * @return the customerStreetAddress1
	 */
	public String getCustomerStreetAddress1() {
		return customerStreetAddress1;
	}
	/**
	 * @param customerStreetAddress1 the customerStreetAddress1 to set
	 */
	public void setCustomerStreetAddress1(String customerStreetAddress1) {
		this.customerStreetAddress1 = customerStreetAddress1;
	}
	/**
	 * @return the customerStreetAddress2
	 */
	public String getCustomerStreetAddress2() {
		return customerStreetAddress2;
	}
	/**
	 * @param customerStreetAddress2 the customerStreetAddress2 to set
	 */
	public void setCustomerStreetAddress2(String customerStreetAddress2) {
		this.customerStreetAddress2 = customerStreetAddress2;
	}
	/**
	 * @return the customerCity
	 */
	public String getCustomerCity() {
		return customerCity;
	}
	/**
	 * @param customerCity the customerCity to set
	 */
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	/**
	 * @return the customerRegionCode
	 */
	public String getCustomerRegionCode() {
		return customerRegionCode;
	}
	/**
	 * @param customerRegionCode the customerRegionCode to set
	 */
	public void setCustomerRegionCode(String customerRegionCode) {
		this.customerRegionCode = customerRegionCode;
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
	 * @return the customerPlus4
	 */
	public String getCustomerPlus4() {
		return customerPlus4;
	}
	/**
	 * @param customerPlus4 the customerPlus4 to set
	 */
	public void setCustomerPlus4(String customerPlus4) {
		this.customerPlus4 = customerPlus4;
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
	 * @return the errorUrl
	 */
	public String getErrorUrl() {
		return errorUrl;
	}
	/**
	 * @param errorUrl the errorUrl to set
	 */
	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
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
