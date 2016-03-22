package com.foodstore.serg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.foodstore.serg.model.Meal;

public class MealRepository {
	
	private static List<Meal> listOfMeals = new ArrayList<>();
	
	public static boolean add(final Meal meal){
		return listOfMeals.add(meal);
	}
	
	public static boolean remove(final long id){
		Iterator<Meal> iter = listOfMeals.iterator();
		while(iter.hasNext()){
			Meal meal = iter.next();
			if(meal.getId() == id){
				iter.remove();
				return true;
			}
		}
		return false;
	}
		
	
	public static List<Meal> getAll() {
		return listOfMeals;
	}
	
	public static Meal getMealById(final long id){
		for(Meal meal : listOfMeals){
			if(meal.getId() == id){
				return meal;
			}
		}
		return null;
	}
	
	public static List<Meal> search(final String searchedField){
		
		List<Meal> resultOfSearch = new ArrayList<>();
		
		for(Meal meal: listOfMeals){
			if(searchedField.equalsIgnoreCase(meal.getTitle()) || 
					searchedField.equalsIgnoreCase(meal.getDescription()) || 
					searchedField.equalsIgnoreCase(meal.getOwner())||
					searchedField.equalsIgnoreCase(meal.getType()) ||
					searchedField.equalsIgnoreCase(String.valueOf(meal.getId()))||
					searchedField.equalsIgnoreCase(String.valueOf(meal.getPrice())) || 
					searchedField.equalsIgnoreCase(String.valueOf(meal.isAvailable()))) {
				
				resultOfSearch.add(meal);
			}
		}
		return resultOfSearch;
	}
}
