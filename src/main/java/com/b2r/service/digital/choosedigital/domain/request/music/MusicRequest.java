/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.music;

import com.b2r.service.digital.choosedigital.domain.request.DigitalRequest;

/**
 * @author Gavin
 *
 */
public abstract class MusicRequest extends DigitalRequest{

	@Override
	public String getPrefix() {
		return "music";
	}

}
