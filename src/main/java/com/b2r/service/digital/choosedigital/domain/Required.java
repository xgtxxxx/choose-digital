/**
 * 
 */
package com.b2r.service.digital.choosedigital.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Service;

/**
 * @author Gavin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Service
public @interface Required {
	RequiredType type() default RequiredType.PARAM;
}
