package com.foodstore.serg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.foodstore.serg.model.Meal;

public class MealRepository {
	
	private static List<Meal> listOfMeals = new ArrayList<>();
	
	public static boolean add(Meal meal){
		return listOfMeals.add(meal);
	}
	
	
	public static boolean remove(long id){
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
	
	
	public static Meal getMealById(long id){
		for(Meal meal : listOfMeals){
			if(meal.getId() == id){
				return meal;
			}
		}
		return null;
	}
	
	public static List<Meal> search(String searchedField){
		
		List<Meal> resultOfSearch = new ArrayList<>();
		
		for(Meal meal: MealRepository.getAll()){
		
			if(searchedField.equals(meal.getTitle()) || 
					searchedField.equals(meal.getDescription()) || 
					searchedField.equals(meal.getOwner())||
					searchedField.equals(meal.getType()) ||
					searchedField.equals(String.valueOf(meal.getPrice())) ||
					searchedField.equals(String.valueOf(meal.getTime())) || 
					searchedField.equals(String.valueOf(meal.isAvailable()))) {
				
				resultOfSearch.add(meal);
			}
		}
		
		return resultOfSearch;
	}
}
