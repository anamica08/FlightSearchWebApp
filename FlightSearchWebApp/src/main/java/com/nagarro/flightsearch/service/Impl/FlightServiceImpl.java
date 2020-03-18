package com.nagarro.flightsearch.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.nagarro.flightsearch.comparator.ListSortUtility;
import com.nagarro.flightsearch.dao.FlightDao;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.service.FlightService;


/**
 * The Class FlightServiceImpl.
 */
@Service
public class FlightServiceImpl implements FlightService{

	/** The flightdao. */
	@Autowired
	private FlightDao flightdao;
	
	/* (non-Javadoc)
	 * @see com.nagarro.flightsearch.service.FlightService#add(com.nagarro.flightsearch.model.Flight)
	 */
	@Transactional
	public void add(Flight flight) {
		flightdao.add(flight);
		System.out.println("Service class: Add Executed");
		
	}

	/* (non-Javadoc)
	 * @see com.nagarro.flightsearch.service.FlightService#getAllFlight(com.nagarro.flightsearch.model.FlightSearchParameter, java.lang.String)
	 */
	@Transactional
	public List<Flight> getAllFlight(FlightSearchParameter param,String sortBy) {
		// TODO Auto-generated method stub
		
		List<Flight> flightList = new ArrayList<Flight>();
		if (sortBy.equals("Fare")) {

			flightList = new ArrayList<Flight>(ListSortUtility.orderByFare(flightdao.getAllFlight(param)));

		} else if (sortBy.equals("FareandDuration")) {

			flightList = new ArrayList<Flight>(ListSortUtility.orderByFareandDuration(flightdao.getAllFlight(param)));

		}
		return flightList;
		
	}

}
