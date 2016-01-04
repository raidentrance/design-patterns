/**
 * 
 */
package com.raidentrance.commons;

/**
 * @author alejandrobautista
 *
 */
public enum ErrorResult {
	EMPTRY_RESULT("%s cannot be null");
	private String message;

	private ErrorResult(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}