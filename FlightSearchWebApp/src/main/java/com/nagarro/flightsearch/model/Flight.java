package com.nagarro.flightsearch.model;

import java.text.ParseException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nagarro.flightsearch.validator.DateFormatter;



/**
 * The Class Flight.
 */
@Entity
@Table(name="flight")
@IdClass(FlightIdentity.class)
public class Flight {
	
	
	/** The flight number. */
	@Id
	@Column(name = "flight_number")
	private String flightNumber;
	
	/** The flight time. */
	@Column(name="time")
	private String flightTime;
	
	/** The valid till. */
	@Id
	@Temporal(TemporalType.DATE)
	@Column(name="valid_till")
	private Date validTill;
	
	/** The departure location. */
	@Column(name="dep_loc")
	private String departureLocation;
	
	/** The arrival location. */
	@Column(name="arr_loc")
	private String arrivalLocation;
	
	/** The flight duration. */
	@Column(name="duration")
	private Double flightDuration;
	
	/** The fare. */
	@Column(name="fare")
	private Integer fare;
	
	/** The status. */
	@Column(name="status")
	private String status;
	
	/** The fclass. */
	@Column(name="class")
	private String fclass;
	
	
	
	
	
	/**
	 * Instantiates a new flight.
	 */
	public Flight() {
		
	}



	/**
	 * Instantiates a new flight.
	 *
	 * @param string1 the string 1
	 * @param string2 the string 2
	 * @param string3 the string 3
	 * @param string4 the string 4
	 * @param string5 the string 5
	 * @param string6 the string 6
	 * @param parseInt the parse int
	 * @param string7 the string 7
	 * @param string8 the string 8
	 * @throws ParseException the parse exception
	 */
	public Flight(String string1, String string2, String string3, String string4, String string5, String string6,
			int parseInt, String string7, String string8) throws ParseException {
		this.flightNumber = string1;
		this.departureLocation = string2;
		this.arrivalLocation = string3;
		this.validTill = DateFormatter.formDateObject(string4);
		this.flightTime = string5;
		this.flightDuration = Double.parseDouble(string6);
		this.fare = parseInt;
		this.status = string7.toUpperCase();
		this.fclass = string8;
	}
	
	
	
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
	
	/**
	 * Gets the flight time.
	 *
	 * @return the flight time
	 */
	public String getFlightTime() {
		return flightTime;
	}
	
	/**
	 * Sets the flight time.
	 *
	 * @param flightTime the new flight time
	 */
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	
	/**
	 * Gets the flight duration.
	 *
	 * @return the flight duration
	 */
	public Double getFlightDuration() {
		return flightDuration;
	}
	
	/**
	 * Sets the flight duration.
	 *
	 * @param flightDuration the new flight duration
	 */
	public void setFlightDuration(Double flightDuration) {
		this.flightDuration = flightDuration;
	}
	
	/**
	 * Gets the fare.
	 *
	 * @return the fare
	 */
	public Integer getFare() {
		return fare;
	}
	
	/**
	 * Sets the fare.
	 *
	 * @param fare the new fare
	 */
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the fclass.
	 *
	 * @return the fclass
	 */
	public String getFclass() {
		return fclass;
	}
	
	/**
	 * Sets the fclass.
	 *
	 * @param fclass the new fclass
	 */
	public void setFclass(String fclass) {
		this.fclass = fclass;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/*
	 * Override equals to insert unique data to list.
	 * 
	 * */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Flight) {
			if (this.hashCode() == ((Flight) obj).hashCode()) {
				return true;
			}
		}
		return false;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int result = 17;

		result = 31 * result + flightNumber.hashCode();
		result = 31 * result + departureLocation.hashCode();
		result = 31 * result + arrivalLocation.hashCode();
		result = 31 * result + validTill.hashCode();
		result = 31 * result + flightTime.hashCode();
		long durationLong = Double.doubleToLongBits(this.flightDuration);
		result = 31 * result + (int) (durationLong ^ (durationLong >>> 32));
		result = 31 * result + fare;
		result = 31 * result + status.hashCode();
		result = 31 * result + fclass.hashCode();
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightTime=" + flightTime + ", validTill=" + validTill
				+ ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", flightDuration=" + flightDuration + ", fare=" + fare + ", status=" + status + ", fclass=" + fclass
				+ "]";
	}
	
	


}
