package com.foodstore.serg.utils;

import java.util.Date;
import org.joda.time.DateTime;

public class TimeUtils {
	
	
	public static String getTime(Date date){
		
		DateTime dateTime = new DateTime(date);
		return String.valueOf(dateTime.getHourOfDay())+":"+String.valueOf(dateTime.getMinuteOfHour())
		+":"+String.valueOf(dateTime.secondOfMinute());
	}
}
