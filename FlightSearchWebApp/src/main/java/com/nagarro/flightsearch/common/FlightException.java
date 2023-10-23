package com.nagarro.flighsearch.common;



/**
 * Exception Class .
 * 
 * @author anamika
 *
 */
public class FlightException extends Exception {

	private final String message;

	private static final long serialVersionUID = 5426440286237360960L;

	public FlightException() {
		this.message = null;
	}

	public FlightException(String message, Exception exception) {
		super(exception);
		this.message = message;
	}

	public FlightException(String message) {
		this.message = message;

	}

	public FlightException(Exception cause) {
		super(cause);
		this.message = null;
	}

	public String getMessage() {
		return message;
	}

}
