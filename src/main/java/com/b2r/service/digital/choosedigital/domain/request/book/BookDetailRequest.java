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
public class BookDetailRequest extends BookRequest{
	@Required(type=RequiredType.PATH)
	private String cdin;
	@Required(type=RequiredType.PATH)
	private String country;
	private String hashedCustomerId;
	private String tenantId;
	private String street1;
	private String street2;
	private String city;
	private String regionCode;
	private String postalCode;
	private String plus4;
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
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}
	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}
	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the plus4
	 */
	public String getPlus4() {
		return plus4;
	}
	/**
	 * @param plus4 the plus4 to set
	 */
	public void setPlus4(String plus4) {
		this.plus4 = plus4;
	}
	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.DETAIL;
	}
}
