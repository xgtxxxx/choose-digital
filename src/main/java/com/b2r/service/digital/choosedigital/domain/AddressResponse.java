/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

import java.util.List;

/**
 * @author Gavin
 *
 */
public class AddressResponse {
	private String status;
	private List<Address> addresses;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
