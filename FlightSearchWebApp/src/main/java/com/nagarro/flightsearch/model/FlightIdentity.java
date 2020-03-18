package com.nagarro.flightsearch.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;



/**
 * The Class FlightIdentity.
 */
public class FlightIdentity implements Serializable{
	
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The flight number. */
	@Column(name = "flight_number")
	private String flightNumber;
	
	/** The valid till. */
	@Column(name="valid_till")
	private Date validTill;
	
	
	
	/**
	 * Gets the flight number.
	 *
	 * @return the flight number
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	
	/**
	 * Sets the flight number.
	 *
	 * @param flightNumber the new flight number
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	/**
	 * Gets the valid till.
	 *
	 * @return the valid till
	 */
	public Date getValidTill() {
		return validTill;
	}
	
	/**
	 * Sets the valid till.
	 *
	 * @param validTill the new valid till
	 */
	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}
	
	
	

}
