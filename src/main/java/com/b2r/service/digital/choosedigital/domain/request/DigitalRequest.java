/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain.request;

import java.lang.reflect.Field;

import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.b2r.service.digital.choosedigital.domain.DigitalMethod;
import com.b2r.service.digital.choosedigital.domain.HttpMethod;
import com.b2r.service.digital.choosedigital.domain.Required;
import com.b2r.service.digital.choosedigital.domain.RequiredType;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * @author Gavin
 *
 */
public abstract class DigitalRequest {
	protected static final Logger LOG = LoggerFactory.getLogger(DigitalRequest.class);
	
	public String getRequestUrl() throws IllegalArgumentException, IllegalAccessException{
		Class<?> clazz = this.getClass();
		
		String prefixPath = getPrefix();
		if(StringUtils.isEmpty(prefixPath)){
			String errorMsg = "Check required field failed : prefix in "+clazz.getName()+" should not be null!";
			LOG.error(errorMsg);
			throw new NullPointerException(errorMsg);
		}
		
		final UriBuilder builder = UriBuilder.fromPath(prefixPath);
		
		DigitalMethod digitalMethod = getMethod();
		builder.path(digitalMethod.getName());
		
		if(digitalMethod.getHttpMethod()==HttpMethod.GET){
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				Object value = field.get(this);
				Required required = field.getAnnotation(Required.class);
				if(required!=null){
					if(value==null){
						String errorMsg = "Check required field failed : "+field.getName()+" in "+clazz.getName()+" should not be null!";
						LOG.error(errorMsg);
						throw new NullPointerException(errorMsg);
					}
					
					if(required.type()==RequiredType.PATH){
						builder.path(String.valueOf(value));
					}else{
						builder.queryParam(field.getName(), value);
					}
				}else{
					if(value!=null){
						builder.queryParam(field.getName(), value);
					}
				}
			}
		}
		return builder.build().toASCIIString();
	}
	
	public MultivaluedMapImpl getMultivaluedMapImpl() throws IllegalArgumentException, IllegalAccessException{
		final MultivaluedMapImpl params = new MultivaluedMapImpl();
		Class<?> clazz = this.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			Object value = field.get(this);
			Required required = field.getAnnotation(Required.class);
			if(required!=null){
				if(value==null){
					String errorMsg = "Check required field failed : "+field.getName()+" in "+clazz.getName()+" should not be null!";
					LOG.error(errorMsg);
					throw new NullPointerException(errorMsg);
				}
			}
			
			if(value!=null){
				params.add(field.getName(), value);
			}
		}
		return params;
	}
	
	/**
	 * @return
	 */
	public abstract DigitalMethod getMethod();
	
	public abstract String getPrefix();
}
