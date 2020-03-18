package com.nagarro.flightsearch.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.flightsearch.dao.FlightDao;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.validator.DateFormatter;


/**
 * Implementation class for Interface FlightDao.
 *
 * @author anamika
 */
@Repository
public class FlightDaoImpl implements FlightDao {

	/** The session. */
	@Autowired
	private SessionFactory session;

	/* (non-Javadoc)
	 * @see com.nagarro.flightsearch.dao.FlightDao#add(com.nagarro.flightsearch.model.Flight)
	 */
	@Transactional
	public void add(Flight flight) {
		// TODO Auto-generated method stub
		Session tsession = session.getCurrentSession();
		
		try {
			Query query = tsession.createQuery("from Flight where flightNumber=:no and validTill=:date");
			query.setParameter("no", flight.getFlightNumber());
			query.setParameter("date", flight.getValidTill());
			if (query.list().size() == 0) {
				tsession.save(flight);
				System.out.println("Hibernate save succesful");
				

			}
		} catch (Exception e) {
			System.out.println("Duplicate Data");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nagarro.flightsearch.dao.FlightDao#getAllFlight(com.nagarro.flightsearch.
	 * model.FlightSearchParameter)
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Flight> getAllFlight(FlightSearchParameter param) {
		// TODO Auto-generated method stub
		Session ssn = session.getCurrentSession();
		Query query = ssn.createQuery("from Flight where " + "status=:available and "
				+ "departureLocation=:dep and arrivalLocation=:arr and validTill>=:date " + "and fclass=:class");
		query.setParameter("dep", param.getDepartureLocation());
		query.setParameter("arr", param.getArrivalLocation());
		query.setParameter("date", DateFormatter.formSqlDate(param.getFlightDate()));
		query.setParameter("available", "Y");
		query.setParameter("class", param.getFlightClass());
		List<Flight> matchedFlight = query.list();
		System.out.println(matchedFlight);
		return matchedFlight;
	}

}
