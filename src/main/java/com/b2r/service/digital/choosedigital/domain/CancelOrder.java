/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

import java.util.Date;

/**
 * @author Gavin
 *
 */
public class CancelOrder {
	private String orderId;
	private String cancelOrderId;	
	private Date cancelTransactionDateUTC;	
	private String priceSold;
	private String cancelTransactionId;
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
	 * @return the cancelOrderId
	 */
	public String getCancelOrderId() {
		return cancelOrderId;
	}
	/**
	 * @param cancelOrderId the cancelOrderId to set
	 */
	public void setCancelOrderId(String cancelOrderId) {
		this.cancelOrderId = cancelOrderId;
	}
	/**
	 * @return the cancelTransactionDateUTC
	 */
	public Date getCancelTransactionDateUTC() {
		return cancelTransactionDateUTC;
	}
	/**
	 * @param cancelTransactionDateUTC the cancelTransactionDateUTC to set
	 */
	public void setCancelTransactionDateUTC(Date cancelTransactionDateUTC) {
		this.cancelTransactionDateUTC = cancelTransactionDateUTC;
	}
	/**
	 * @return the priceSold
	 */
	public String getPriceSold() {
		return priceSold;
	}
	/**
	 * @param priceSold the priceSold to set
	 */
	public void setPriceSold(String priceSold) {
		this.priceSold = priceSold;
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
}
