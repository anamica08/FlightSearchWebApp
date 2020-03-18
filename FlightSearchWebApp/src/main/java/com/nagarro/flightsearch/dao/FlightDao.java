package com.nagarro.flightsearch.dao;

import java.util.List;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;


/**
 * The Interface FlightDao.
 */
public interface FlightDao {

	/**
	 * Adds to Database.
	 *
	 * @param flight the flight
	 */
	public void add(Flight flight);
	
	/**
	 * Gets the all flight.
	 *
	 * @param param the param
	 * @return the all flight
	 */
	public List<Flight> getAllFlight(FlightSearchParameter param);
}
