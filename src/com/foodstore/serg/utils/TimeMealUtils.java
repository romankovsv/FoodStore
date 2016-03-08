package com.foodstore.serg.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMealUtils {
	
	public static String getTime(){
		
		  SimpleDateFormat format = new SimpleDateFormat(" HH:mm:ss  yyyy-MM-dd");
	      String time = format.format(new Date());
		
		return time;
	}
}
