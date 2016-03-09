package com.foodstore.serg.utils;

import com.foodstore.serg.model.Meal;

public class CheckMealUtils {
	
	private static boolean checkParams(String title, String description, String type, 
			Boolean available, String price, String owner, String time){
		
		return !(title == null || title.isEmpty() || description == null || description.isEmpty()||
				type == null ||type.isEmpty() ||owner == null ||owner.isEmpty() || available == null ||
				price ==  null || price.isEmpty() || time == null || time.isEmpty());
	}
	
	public static Meal create(String title, String description, String type, 
			boolean available, String price, String owner, String time){
		
		if(checkParams(title, description, type, available, price, owner, time)){
			
			return new Meal(title, description, type, available, price, owner);
		}
		return null;
	}
}
