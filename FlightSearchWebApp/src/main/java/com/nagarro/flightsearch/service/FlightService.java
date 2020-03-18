package com.nagarro.flightsearch.service;

import java.util.List;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;


/**
 * The Interface FlightService.
 */
public interface FlightService {

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
	 * @param sortBy the sort by
	 * @return the all flight
	 */
	public List<Flight> getAllFlight(FlightSearchParameter param ,String sortBy);
}


