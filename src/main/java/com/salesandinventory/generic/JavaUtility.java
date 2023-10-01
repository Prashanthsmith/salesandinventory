package com.salesandinventory.generic;

import java.util.Date;
import java.util.Random;

/**
 * This class contains java related methods
 * @author prashanth
 *
 */
public class JavaUtility {
	/**
	 * This method helps to get the random number.
	 * @return
	 */
public int getrandomNumber() {
	Random r=new Random();
	int random = r.nextInt(1000);
	return random;
}
/**
 * This method helps to fetch date.
 * @return
 */
public String getSystemDate() {
	Date date = new Date();
	return date.toString();
}
/**
 * This method helps to fetch date in the date format.
 * @return
 */
public String getSystemDateInFormat() {
	Date dateTime=new Date();
	String[] d = dateTime.toString().split(" ");
	String day = d[0];
	String month = d[1];
	String date = d[2];
	String year = d[5];
	String finalFormat = day+" "+month+" "+date+" "+year;
	return finalFormat;
	
}
}
