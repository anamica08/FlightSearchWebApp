package com.nagarro.flightsearch.dao;

import com.nagarro.flightsearch.model.User;


/**
 * The Interface UserDao.
 */
public interface UserDao {
	
	/**
	 * Gets the user by username.
	 *
	 * @param username the username
	 * @return the user by username
	 */
	public User getUserByUsername(String username) ;
}
