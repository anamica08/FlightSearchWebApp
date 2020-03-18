package com.nagarro.flightsearch.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	private FlightService flightService;

	/**
	 * Gets the all flights.
	 *
	 * @param flightsearchparameter the flightsearchparameter
	 * @param result the result
	 * @param OutputPreference the output preference
	 * @param model the model
	 * @return the all flights
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String getAllFlights(
			@ModelAttribute("flightsearchparameter") @Validated FlightSearchParameter flightsearchparameter,
			BindingResult result, @RequestParam String OutputPreference, Model model) {
		/*
		 * If input parameters has errors then redirect to same page.
		 * 
		 * */
		if (result.hasErrors()) {
			model.addAttribute("errormessage","Please make sure all the parameters are supplied correctly.");
			model.addAttribute("flightsearchparameter", new FlightSearchParameter());
			System.out.println("input field has some problem");
			return "viewpage";
		} 
		/*
		 * If input search parameters are valid.
		 * 
		 * */
		
		else {
			Map<String, Object> map = new HashMap<>();
			List<Flight> availableFlights = new ArrayList<>();
			availableFlights = flightService.getAllFlight(flightsearchparameter, OutputPreference);
			if(availableFlights.size() == 0) {
				map.put("errormessage", "No flights available for supplied parameters");
			}else {
				
				System.out.println("Search parameters submitted by user" + flightsearchparameter);
				map.put("List", availableFlights);				
			}
			
			map.put("flightsearchparameter", new FlightSearchParameter());
			model.addAllAttributes(map);
			return "viewpage";
		}

	}

}
