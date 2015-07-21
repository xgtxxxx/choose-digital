/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gavin
 *
 */
public class JsonReader {
	public static String read(String path) {
		BufferedReader reader = null;
		StringBuffer laststr = new StringBuffer();
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(
					JsonReader.class.getResourceAsStream(path), "UTF-8");
			reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				laststr.append(tempString.trim());
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return laststr.toString();
	}
}
