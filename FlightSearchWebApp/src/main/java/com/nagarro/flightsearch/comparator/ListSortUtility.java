package com.nagarro.flightsearch.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.nagarro.flightsearch.model.Flight;


/**
 * The Class ListSortUtility.
 */
public class ListSortUtility {

	/**
	 * Order by fare.
	 *
	 * @param list the list
	 * @return List of Sorted Flights on the basis of Fare.
	 */
	public static ArrayList<Flight> orderByFare(List<Flight> list) {
		FareCompare comparator = new FareCompare();
		Collections.sort(list, comparator);
		return (ArrayList<Flight>) list;
	}

	/**
	 * Order by fareand duration.
	 *
	 * @param list the list
	 * @return List of Sorted Flights on the basis of Fare and Duration.
	 */
	public static ArrayList<Flight> orderByFareandDuration(List<Flight> list) {
		ArrayList<Flight> asList = new ArrayList<>(orderByFare(list));
		Collections.sort(asList, new DurationCompare());
		return asList;
	}

}
