package com.foodstore.serg.utils;

import com.foodstore.serg.model.Meal;

public class CheckMealUtils {
	
	//In case of local use - PRIVATE.
	private static boolean checkParams(String title, String description, String type, 
			Boolean available, String price, String owner, String time){
		
		/*could be just return (..........)*/
		
		return (title == null || title.isEmpty() || description == null || description.isEmpty()||
				type == null ||type.isEmpty() ||owner == null ||owner.isEmpty() || available == null ||
				price ==  null || price.isEmpty() || time == null || time.isEmpty());
	}
	
	
	//Do not take date in parameters. Create it here or in Model constructor
	//I use TimeMealUtils in Modelconstuctor now
	public static Meal create(String title, String description, String type, 
			boolean available, String price, String owner, String time){
		
		if(checkParams(title, description, type, available, price, owner, time)){
			return new Meal(title, description, type, available, price, owner);
		}
		
		return null;
	}
}
