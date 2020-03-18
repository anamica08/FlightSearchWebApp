package com.nagarro.flightsearch.comparator;

import java.util.Comparator;

import com.nagarro.flightsearch.model.Flight;

/**
 * This Class Compares the Flight Objects on the basis of Fare.
 * 
 * @author anamika
 *
 */
public class FareCompare implements Comparator<Flight> {
	
	
	public int compare(Flight f1, Flight f2) {
		if (f1.getFare() < f2.getFare())
			return -1;
		if (f1.getFare() > f2.getFare())
			return 1;
		else
			return 0;
	}
	
	
}
