/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.book;

import java.util.Date;

/**
 * @author Gavin
 *
 */
public class BookPurchase {
	private String orderId;
	private Date transactionDate;	
	private String downloadLink;
	private String priceSold;
	private Date exchangeRateDate;	
	private double exchangeRate;	
	private Book book;
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
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the downloadLink
	 */
	public String getDownloadLink() {
		return downloadLink;
	}
	/**
	 * @param downloadLink the downloadLink to set
	 */
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
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
	 * @return the exchangeRateDate
	 */
	public Date getExchangeRateDate() {
		return exchangeRateDate;
	}
	/**
	 * @param exchangeRateDate the exchangeRateDate to set
	 */
	public void setExchangeRateDate(Date exchangeRateDate) {
		this.exchangeRateDate = exchangeRateDate;
	}
	/**
	 * @return the exchangeRate
	 */
	public double getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}
}
