/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request;

import junit.framework.Assert;

import org.junit.Test;

import com.b2r.service.digital.choosedigital.domain.request.book.BookListRequest;
import com.b2r.service.digital.choosedigital.domain.request.music.MusicListRequest;
import com.b2r.service.digital.choosedigital.domain.request.music.MusicPurchaseRequest;
import com.b2r.service.digital.choosedigital.domain.request.music.MusicSearchRequest;

/**
 * @author Gavin
 *
 */
public class TestRequest {
	
	@Test(expected=NullPointerException.class)
	public void testNullField(){
		MusicSearchRequest request = new MusicSearchRequest();
		try {
			request.getRequestUrl();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMusicSearchRequest() throws IllegalArgumentException, IllegalAccessException{
		MusicSearchRequest request = new MusicSearchRequest();
		request.setTerm("u2");
		request.setCountry("zh");
		request.setRows(5);
		Assert.assertEquals("music/search?term=u2&country=zh&rows=5", request.getRequestUrl());
	}
	
	@Test
	public void testMusicPuchaseRequest() throws IllegalArgumentException, IllegalAccessException{
		MusicPurchaseRequest request = new MusicPurchaseRequest();
		request.setCdin("111");
		request.setPriceSold(1000);
		request.setTaxAmount(10);
		request.setCustomerId("222");
		request.setCustomerPostalCode("610000");
		request.setCustomerCountryCode("0001");
		request.setAuthentication("444");
		
		Assert.assertEquals("{taxAmount=[10], customerId=[222], authentication=[444], customerCountryCode=[0001], cdin=[111], priceSold=[1000], customerPostalCode=[610000]}", request.getMultivaluedMapImpl().toString());
		Assert.assertEquals("music/purchase", request.getRequestUrl());
	}
	
	@Test
	public void testMusicList() throws IllegalArgumentException, IllegalAccessException{
		MusicListRequest request = new MusicListRequest();
		request.setListId("top");
		request.setCountry("us");
		request.setRows(100);
		Assert.assertEquals("music/list/top/us?rows=100", request.getRequestUrl());
	}
	
	@Test(expected=NullPointerException.class)
	public void bookNullPrefix() throws IllegalArgumentException, IllegalAccessException{
		BookListRequest request = new BookListRequest();
		request.setListId("top");
		request.setCountry("us");
		request.getRequestUrl();
	}
	
	@Test
	public void bookPath() throws IllegalArgumentException, IllegalAccessException{
		BookListRequest request = new BookListRequest();
		request.setListId("top");
		request.setCountry("us");
		request.setPrefix("ebook");
		request.setRows(100);
		Assert.assertEquals("ebook/list/top/us?rows=100", request.getRequestUrl());
	}
}
