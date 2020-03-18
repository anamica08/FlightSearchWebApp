package com.nagarro.flightsearch.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nagarro.flighsearch.common.FlightException;




/**
 * Date Validator 
 * @author anamika
 *
 */
public class DateFormatter {
	
	/**
	 * This Parse Input String to a Date Object and Validate.
	 * @param Object
	 * @return Date Object
	 * @throws ParseException
	 */
	public static Date formDateObject(String Object) throws ParseException {
		if (Object instanceof String) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date date = null;
			date = formatter.parse(Object);
			return date;
		} else

		{
			try {
				throw new FlightException("Invalid parameter: Expected String object!! ");
			} catch (FlightException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}
	
	public static java.sql.Date formSqlDate(Date date ){
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;
		
	}
}