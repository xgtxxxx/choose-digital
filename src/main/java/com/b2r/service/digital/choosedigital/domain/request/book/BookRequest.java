/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.book;

import com.b2r.service.digital.choosedigital.domain.request.DigitalRequest;

/**
 * @author Gavin
 *
 */
public abstract class BookRequest extends DigitalRequest{
	
	private String prefix;

	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
