package com.foodstore.serg.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	
	private static final String DATE_FORMAT = "HH:mm:ss  yyyy-MM-dd";
	
	public static String getTime(){
		
		 final SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
	     final String time = format.format(new Date());
		System.out.println("Hello");
		return time;
	}
}
