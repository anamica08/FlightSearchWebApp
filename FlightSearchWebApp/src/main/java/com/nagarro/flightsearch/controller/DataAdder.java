package com.nagarro.flightsearch.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nagarro.flightsearch.loader.FileLoader;
import com.nagarro.flightsearch.loader.List;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.service.FlightService;


/**
 * The Class DataAdder.
 */
@Controller
public class DataAdder {

	/** The flight service. */
	@Autowired
	private FlightService flightService;
	
	
	
	/**
	 * Adds the data to DB.
	 */
	public void addDataToDB() {
		FileLoader loader = new FileLoader();
		loader.loadDataFromFiles();
		HashSet<Flight> set = new HashSet<>(List.getListOfFlights());
				
		for(Flight flight : set) {
			flightService.add(flight); //throwing nullpointer exception
		}
		System.out.println("flight data is inserted");
	}

}
