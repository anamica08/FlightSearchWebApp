package com.nagarro.flightsearch.model;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.nagarro.flightsearch.validator.DateFormatter;


/**
 * The Class FlightSearchParameter.
 */
public class FlightSearchParameter {

	/** The in. */
	static Scanner in = new Scanner(System.in);

	/** The departure location. Validatng location using hibernate validator */
	@NotNull(message = "Please enter departure location")
	@Size(min = 3, max = 3, message = "Location should be 3 characters long only.")
	private String departureLocation;

	/** The arrival location.Validatng location using hibernate validator */
	@NotNull(message = "Please enter arrival location")
	@Size(min = 3, max = 3, message = "Location should be 3 characters long only.")
	private String arrivalLocation;

	/** The flight date. */
	@Temporal(TemporalType.DATE)
	@NotNull(message = "Please enter Date")
	private Date flightDate;

	/** The flight class. */
	private String flightClass;

	/** The Output preference. */
	private String OutputPreference;

	/**
	 * Gets the departure location.
	 *
	 * @return the departure location
	 */
	public String getDepartureLocation() {
		return departureLocation;
	}

	/**
	 * Sets the departure location.
	 *
	 * @param departureLocation the new departure location
	 */
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	/**
	 * Gets the arrival location.
	 *
	 * @return the arrival location
	 */
	public String getArrivalLocation() {
		return arrivalLocation;
	}

	/**
	 * Sets the arrival location.
	 *
	 * @param arrivalLocation the new arrival location
	 */
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	/**
	 * Gets the flight date.
	 *
	 * @return the flight date
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * Sets the flight date.
	 *
	 * @param flightDate the new flight date
	 * @throws ParseException 
	 */
	public void setFlightDate(String flightDate) throws ParseException {
		this.flightDate = DateFormatter.formDateObject(flightDate);
	}

	/**
	 * Gets the flight class.
	 *
	 * @return the flight class
	 */
	public String getFlightClass() {
		return flightClass;
	}

	/**
	 * Sets the flight class.
	 *
	 * @param flightClass the new flight class
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass.toUpperCase();
	}

	/**
	 * Gets the output preference.
	 *
	 * @return the output preference
	 */
	public String getOutputPreference() {
		return OutputPreference;
	}

	/**
	 * Sets the output preference.
	 *
	 * @param outputPreference the new output preference
	 */
	public void setOutputPreference(String outputPreference) {
		OutputPreference = outputPreference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightSearchParameter [departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", flightDate=" + flightDate + ", flightClass=" + flightClass + ", OutputPreference="
				+ OutputPreference + "]";
	}

}
