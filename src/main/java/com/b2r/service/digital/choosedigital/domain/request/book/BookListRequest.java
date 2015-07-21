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
public class BookListRequest extends BookRequest{
	@Required(type=RequiredType.PATH)
	private String listId;
	@Required(type=RequiredType.PATH)
	private String country;
	private Integer rows;
	private String tenantId;
	/**
	 * @return the listId
	 */
	public String getListId() {
		return listId;
	}
	/**
	 * @param listId the listId to set
	 */
	public void setListId(String listId) {
		this.listId = listId;
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
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
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
		return DigitalMethod.LIST;
	}
}
