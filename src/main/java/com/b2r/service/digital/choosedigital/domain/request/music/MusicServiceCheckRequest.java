/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.music;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;

/**
 * @author Gavin
 *
 */
public class MusicServiceCheckRequest extends MusicRequest{

	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.SERVICE_CHECK;
	}

}
