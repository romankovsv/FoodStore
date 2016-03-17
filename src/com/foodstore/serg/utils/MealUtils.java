package com.foodstore.serg.utils;

import com.foodstore.serg.model.DesertBuilder;
import com.foodstore.serg.model.MainCourseBuilder;
import com.foodstore.serg.model.Meal;
import com.foodstore.serg.model.SoupBuilder;

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
		
		System.out.println("hello");
		
		if(checkParams(title, description, type, available, price, owner)){
			
			if(type.equals("soup")){
				meal = new SoupBuilder()
						.id()
						.title(title)
						.type(type)
						.description(description)
						.available(available)
						.price(price)
						.owner(owner)
						.time()
						.build();
			}else if(type.equals("mainCourse")){
				meal = new MainCourseBuilder()
						.id()
						.title(title)
						.description(description)
						.available(available)
						.type(type)
						.price(price)
						.owner(owner)
						.time()
						.build();
			}else if(type.equals("desert")){
				meal = new DesertBuilder()
						.id()
						.title(title)
						.type(type)
						.description(description)
						.available(available)
						.price(price)
						.owner(owner)
						.time()
						.build();
			} else{
				meal = null;
			}
			
			return meal;
		}
		return meal;
	}
	
}
