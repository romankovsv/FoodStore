package com.foodstore.serg.service;

import java.util.ArrayList;
import java.util.List;

import com.foodstore.serg.dao.MealRepository;
import com.foodstore.serg.model.Meal;

public class MealService {
	
	public static void add(Meal meal){
		MealRepository.add(meal);
	}
	
	public static List<Meal> getAll(){
		return MealRepository.getAll();
	}
	
	public static boolean remove(Meal meal){
		return MealRepository.remove(meal);
	}
	
	/**
	 * Should be checked if List isEmpty and in such case display page There are no such meal
	 */
	public static List<Meal> search(String searchedField){
		
		if(searchedField == null) {
			throw new NullPointerException("Field is Empty");
		}
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
	
	
	public static boolean update(Meal mealForUpdate){
		
		return MealRepository.update(mealForUpdate);
	}
}
