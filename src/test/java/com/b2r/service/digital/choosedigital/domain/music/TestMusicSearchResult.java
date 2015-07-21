/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.music;

import org.junit.Test;

import com.b2r.service.digital.choosedigital.domain.JsonReader;
import com.b2r.service.digital.choosedigital.utils.JsonUtil;

/**
 * @author Gavin
 *
 */
public class TestMusicSearchResult {
	@Test
	public void test(){
		String json = JsonReader.read("/com/b2r/service/digital/choosedigital/domain/music/MusicSearchResult.json");
		MusicSearchResult result = JsonUtil.fromJson(json, MusicSearchResult.class);
		System.out.println(json);
		System.out.println(JsonUtil.toJson(result));
	}
}
