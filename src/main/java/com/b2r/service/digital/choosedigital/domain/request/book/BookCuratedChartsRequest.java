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
public class BookCuratedChartsRequest extends BookRequest{
	@Required(type=RequiredType.PATH)
	private String country;

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

	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.CURATEDCHARTS;
	}
}
