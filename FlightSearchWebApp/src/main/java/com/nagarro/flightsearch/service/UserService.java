package com.nagarro.flightsearch.service;

import com.nagarro.flightsearch.model.User;


/**
 * The Interface UserService.
 */
public interface UserService {
	
	/**
	 * Gets the user by username.
	 *
	 * @param username the username
	 * @return the user by username
	 */
	public User getUserByUsername(String username) ;
	
	/**
	 * Validate.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	public boolean validate(String username, String password);
}
