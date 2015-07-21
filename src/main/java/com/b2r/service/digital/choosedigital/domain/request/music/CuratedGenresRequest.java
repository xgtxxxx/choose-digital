/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request.music;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;

/**
 * @author Gavin
 *
 */
public class CuratedGenresRequest extends MusicRequest{

	@Override
	public DigitalMethod getMethod() {
		return DigitalMethod.CURATEDGENRES;
	}

}
