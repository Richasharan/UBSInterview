package com.ubs.opsit.interviews.exception;

public class InvalidTimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private static String errorMsg = "Time format should be HH:MM:SS";
	
	public InvalidTimeException() {
		super(errorMsg);
	}
	
	public InvalidTimeException(String message) {
		super(message);
	}
	
	

}
