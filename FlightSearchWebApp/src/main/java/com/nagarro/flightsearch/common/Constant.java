package com.nagarro.flighsearch.common;






/**
 * This Class Defines All the Constants for The Application.
 * 
 * @author anamika
 *
 */
public class Constant {

	/** The Constant DELIMITER. */
	/*
	 *  Delimiter used in CSV file
	 */
	public static final String DELIMITER = "|";

	/** The Constant FLIGHT_NO_IDX. */
	/*
	 * Indexes for flight POJO
	 * */
	public static final int FLIGHT_NO_IDX = 0;
	
	/** The Constant DEP_LOC_IDX. */
	public static final int DEP_LOC_IDX = 1;
	
	/** The Constant ARR_LOC_IDX. */
	public static final  int ARR_LOC_IDX = 2;
	
	/** The Constant VALID_TILL_IDX. */
	public static final int VALID_TILL_IDX = 3;
	
	/** The Constant FLIGHT_TIME_IDX. */
	public static final int FLIGHT_TIME_IDX = 4;
	
	/** The Constant FLIGHT_DURATION_IDX. */
	public static final  int FLIGHT_DURATION_IDX = 5;
	
	/** The Constant FARE_IDX. */
	public static final int FARE_IDX = 6;
	
	/** The Constant Status_IDX. */
	public static final int Status_IDX = 7;
	
	/** The Constant C_IDX. */
	public static final int C_IDX = 8;

	
	/** The Constant DEFAULT_DATE_FORMAT. */
	public static final String DEFAULT_DATE_FORMAT = "dd-MM-yyyy";
	
	/** The Constant DATE_SEPERATOR. */
	public static final String DATE_SEPERATOR = "-";

	/** The Constant DEFAULT_DIRECTORY_TO_SCAN. */
	public static final String DEFAULT_DIRECTORY_TO_SCAN = "C:\\Users\\anamika\\eclipse-workspace\\FlightSearchWebApp\\src\\main\\java\\com\\nagarro\\flightsearch\\loader\\datafiles";
	
	/** The Constant DEFAULT_FILE_EXTENSION. */
	public static final String DEFAULT_FILE_EXTENSION = ".csv";

}
