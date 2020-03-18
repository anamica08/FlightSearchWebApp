package com.nagarro.flightsearch.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nagarro.flightsearch.dao.UserDao;
import com.nagarro.flightsearch.model.User;
import com.nagarro.flightsearch.service.UserService;


/**
 * The Class UserServiceImpl.
 */
@Service
public class UserServiceImpl implements UserService {
	
	/** The userdao. */
	@Autowired
	private UserDao userdao;

	/* (non-Javadoc)
	 * @see com.nagarro.flightsearch.service.UserService#getUserByUsername(java.lang.String)
	 */
	@Transactional
	@Override
	public User getUserByUsername(String username) {
		return userdao.getUserByUsername(username);

	}

	/* (non-Javadoc)
	 * @see com.nagarro.flightsearch.service.UserService#validate(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean validate(String username, String password) {
		User user = getUserByUsername(username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;

	}

}
