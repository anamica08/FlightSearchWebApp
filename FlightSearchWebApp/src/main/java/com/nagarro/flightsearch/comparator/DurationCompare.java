package com.nagarro.flightsearch.comparator;

import java.util.Comparator;

import com.nagarro.flightsearch.model.Flight;

/**
 * This Class Compares Flight Objects on the Basis of Fare and Duration.
 * 
 * @author anamika
 *
 */
public class DurationCompare implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {

		if (f1.getFlightDuration() < f2.getFlightDuration())
			return -1;
		if (f1.getFlightDuration() > f2.getFlightDuration())
			return 1;
		else
			return 0;

	}

}