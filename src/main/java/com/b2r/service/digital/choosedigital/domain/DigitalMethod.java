/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

/**
 * @author Gavin
 *
 */
public enum DigitalMethod {
	ARTIST("artist",HttpMethod.GET),
	LIST("list",HttpMethod.GET),
	CURATEDGENRES("curatedgenres",HttpMethod.GET),
	DOWNLOAD("download",HttpMethod.GET),
	SEARCH("search",HttpMethod.GET),
	DETAIL("detail",HttpMethod.GET),
	ISRC("isrc",HttpMethod.GET),
	PURCHASE("purchase",HttpMethod.POST),
	UPDATE("update",HttpMethod.PUT),
	CANCEL("cancel",HttpMethod.PUT),
	SERVICE_CHECK("",HttpMethod.GET),
	SUBJECTS("subjects",HttpMethod.GET),
	LANGUAGES("languages",HttpMethod.GET),
	CURATEDCHARTS("curatedcharts",HttpMethod.GET),
	ADDRESSVALIDATION("addressvalidation",HttpMethod.POST);
	
	private String name;
	private HttpMethod httpMethod;
	
	private DigitalMethod(String name,HttpMethod method){
		this.name = name;
		this.httpMethod = method;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the httpMethod
	 */
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}
	/**
	 * @param httpMethod the httpMethod to set
	 */
	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}
}
