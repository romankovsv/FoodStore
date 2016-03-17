package com.foodstore.serg.utils;

import com.foodstore.serg.model.Meal;
import com.foodstore.serg.model.MealBuilder;

public class MealUtils {
	
	private static boolean checkParams(String title, String description, String type, 
			Boolean available, String price, String owner){
		
		return !(title == null || title.isEmpty() || description == null || description.isEmpty()||
				type == null ||type.isEmpty() ||owner == null ||owner.isEmpty() || available == null ||
				price ==  null || price.isEmpty());
	}
	
	public static Meal create(String title, String description, String type, 
			boolean available, String price, String owner){
		
		Meal meal = null;
		
		if(checkParams(title, description, type, available, price, owner)){
		
				meal = new MealBuilder()
						.id()
						.title(title)
						.type(type)
						.description(description)
						.available(available)
						.price(price)
						.owner(owner)
						.build();
			
		
			return meal;
		}
		return meal;
	}
	
}
