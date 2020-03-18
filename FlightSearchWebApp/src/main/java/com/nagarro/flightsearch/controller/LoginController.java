package com.nagarro.flightsearch.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.service.UserService;


/**
 * The Class LoginController.
 */
@Controller
public class LoginController {

	/** The userservice. */
	@Autowired
	private UserService userservice;
	
	/** The data adder. */
	@Autowired
	private DataAdder dataAdder;

	/**
	 * Setup login form.
	 *
	 * @param model    the model
	 * @return the string
	 */
	
	@RequestMapping("/")
	public String setUp(Model model) {
		
		return "login";
	}
	
	
	
	/**
	 * Setup login form.
	 *
	 * @param username the username
	 * @param password the password
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping("/login")
	public String setupLoginForm(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		boolean isValidUser = userservice.validate(username, password);

		if (isValidUser) {
			System.out.println("Valid User");
			String msg = "Welcome" + " " + username;

			Map<String, Object> attributeValues = new HashMap<>();
			attributeValues.put("flightsearchparameter", new FlightSearchParameter());
			attributeValues.put("message", msg);
			model.addAllAttributes(attributeValues);

			/* load data from files*/
			dataAdder.addDataToDB();

			return "viewpage"; // viewpage.jsp is to be implemenetdd
		} else {
			System.out.println("Invalid User");
			String msg = "Sorry!!! Invalid Username or Password";

			model.addAttribute("message", msg);
			return "login";

		}
	}

}
