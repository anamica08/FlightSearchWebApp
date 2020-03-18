package com.nagarro.flightsearch.loader;


import java.util.HashSet;

import com.nagarro.flightsearch.model.Flight;





/**
 * This Class has Details of All the Flights.
 * 
 * @author anamika
 *
 */
public class List {
	private static HashSet<Flight> listOfFlights = new HashSet<Flight>();

	public static HashSet<Flight> getListOfFlights() {
		return listOfFlights;
	}

	public static void setListOfFlights(HashSet<Flight> listOfFlights) {
		List.listOfFlights = listOfFlights;
	}

}
