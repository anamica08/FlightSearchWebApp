package com.nagarro.flightsearch.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.HashSet;

import com.nagarro.flighsearch.common.Constant;
import com.nagarro.flightsearch.model.Flight;

/**
 * Class for Loading Files .
 * 
 * @author anamika
 *
 */

public class FileLoader  {

	/* Lists */
	static HashSet<String> filesToRead = new HashSet<String>();
	public static HashSet<String> locations = new HashSet<String>();
	private static boolean flag = true;

	public static boolean isFlag() {
		return flag;
	}

	public static void setFlag(boolean flag) {
		FileLoader.flag = flag;
	}



	/**
	 * This method lists down all the files in the directory.
	 */
	private void getFilesFromDirectory(String arg) {

		File directory = new File(arg);
		/* Obtaining all the .csv files from a directory */
		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File f, String name) {
				return name.endsWith(Constant.DEFAULT_FILE_EXTENSION);
			}
		};

		File[] fList = directory.listFiles(filter);

		for (File f : fList) {
			filesToRead.add(f.getAbsolutePath());
		}

	}

	/**
	 * This method loads data from files.
	 * 
	 */
	private void readDataFromFiles() {

		for (String str : filesToRead) {
			String line = " ";
			try (BufferedReader reader = new BufferedReader(new FileReader(str))) {

				/* To skip first row. */
				reader.readLine();

				line = reader.readLine();
				while (line != null) {
					String[] tokens = line.split("\\" + Constant.DELIMITER);

					/* Create a new flight object and fill the data */
					Flight F1 = new Flight(tokens[Constant.FLIGHT_NO_IDX], tokens[Constant.DEP_LOC_IDX],
							tokens[Constant.ARR_LOC_IDX], tokens[Constant.VALID_TILL_IDX],
							tokens[Constant.FLIGHT_TIME_IDX], tokens[Constant.FLIGHT_DURATION_IDX],
							Integer.parseInt(tokens[Constant.FARE_IDX]),
							tokens[Constant.Status_IDX], tokens[Constant.C_IDX]);
					List.getListOfFlights().add(F1);
					/* Read next line. */
					line = reader.readLine();
				}
				

			} catch (Exception e) {
				System.out.println("Error in CsvFileReader !!!");
			}

		}
	}

	/**
	 * This main method to load dataset.
	 */
	public void loadDataFromFiles() {

		getFilesFromDirectory(Constant.DEFAULT_DIRECTORY_TO_SCAN);

		readDataFromFiles();

	}

}
