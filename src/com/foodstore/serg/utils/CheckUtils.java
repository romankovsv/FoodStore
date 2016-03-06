package com.foodstore.serg.utils;

import java.util.Date;


import com.foodstore.serg.model.Meal;

public class CheckUtils {
	
	public static boolean checkParams(String title, String description, String type, 
			boolean available, double price, String owner, Date date){
		
		if(title == null || title.isEmpty() || description == null || description.isEmpty()||
				type == null ||type.isEmpty() ||owner == null ||owner.isEmpty() || price == 0.0 || date == null){
			
			/*
			 * How to check boolean available?? It has value false by default but it`s value also
			 * could be set to false!
			 */
			return false;
		}
		return true;
	}
	
	public static Meal create(String title, String description, String type, 
			boolean available, double price, String owner, Date date){
		
		if(checkParams(title, description, type, available, price, owner, date)){
			return new Meal(title, description, type, available, price, owner, date);
		}
		
		return null;
	}
}
