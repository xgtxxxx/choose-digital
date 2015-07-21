/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import java.awt.Container;
import java.util.Date;
import java.util.List;

/**
 * @author Gavin
 *
 */
public class MusicPurchaseInfo {
	private String orderId;
	private Date transactionDate;	
	private String downloadLink;
	private List<DownloadInfo> downloadInfos;
	private int priceSold;	
	private Date exchangeRateDate;
	private double exchangeRate;
	private Container container;
	private Release release;
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
	 * @return the downloadInfos
	 */
	public List<DownloadInfo> getDownloadInfos() {
		return downloadInfos;
	}
	/**
	 * @param downloadInfos the downloadInfos to set
	 */
	public void setDownloadInfos(List<DownloadInfo> downloadInfos) {
		this.downloadInfos = downloadInfos;
	}
	/**
	 * @return the priceSold
	 */
	public int getPriceSold() {
		return priceSold;
	}
	/**
	 * @param priceSold the priceSold to set
	 */
	public void setPriceSold(int priceSold) {
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
	 * @return the container
	 */
	public Container getContainer() {
		return container;
	}
	/**
	 * @param container the container to set
	 */
	public void setContainer(Container container) {
		this.container = container;
	}
	/**
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}
	/**
	 * @param release the release to set
	 */
	public void setRelease(Release release) {
		this.release = release;
	}
}
