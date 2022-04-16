package com.group5.librarymanagement;

import java.sql.Date;
import java.util.Calendar;

public class Test {
	
	public static void main(String arg[]) {
		
		long millis = System.currentTimeMillis();
		Date d = new Date(millis);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, 7);
		
		Date returnDate = new Date(cal.getTimeInMillis());
		
		
		System.out.println(returnDate);
		
	}

}
