package com.nagarro.flightsearch.dao.Impl;

import javax.persistence.NoResultException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.flightsearch.dao.UserDao;
import com.nagarro.flightsearch.model.User;


/**
 * The Implementation Class for UserDao.
 */
@Repository
public class UserDaoImpl implements UserDao {
	
	/** The session. */
	@Autowired
	private SessionFactory session;

	/**
	 * Gets the user by username.
	 *
	 * @param username the username
	 * @return the user by username
	 * @throws NoResultException the no result exception
	 */
	@Transactional
	public User getUserByUsername(String username) throws NoResultException{
		// TODO Auto-generated method stub
		return (User) session.getCurrentSession().get(User.class, username);
	}
}
