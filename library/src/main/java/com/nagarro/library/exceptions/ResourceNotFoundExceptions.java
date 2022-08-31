/**
 * 
 */
package com.nagarro.library.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mohammedmaaz
 *
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptions extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;

	/**
	 * This method returns the not found exception if the resource is not found
	 * 
	 * @param resourceName - name of the resource
	 * @param fieldName    - fiend name of the resource
	 * @param fieldValue   - object of field
	 */
	public ResourceNotFoundExceptions(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}
}