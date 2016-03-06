package com.foodstore.serg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.foodstore.serg.model.Meal;

public class MealRepository {
	
	private static List<Meal> listOfMeals = new ArrayList<>();
	
	public static void add(Meal meal){
		listOfMeals.add(meal);
	}
	
	public static boolean remove(Meal mealForDelete){
		
		Iterator<Meal> iter = listOfMeals.iterator();
		while(iter.hasNext()){
			Meal meal = iter.next();
			if(mealForDelete.equals(meal)){
				iter.remove();
				return true;
			}
		}
		return false;
	}
	
	public static boolean removeById(long id){
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
	
	public static boolean removeByTitle(String title){
		Iterator<Meal> iter = listOfMeals.iterator();
		while(iter.hasNext()){
			Meal meal = iter.next();
			if(meal.getTitle().equals(title)){
				iter.remove();
				return true;
			}
		}
		return false;
	}
	
	public static boolean update (Meal mealForUpdate){
		for(int i=0; i<listOfMeals.size(); i++){
			if(listOfMeals.get(i).getId() == mealForUpdate.getId()){
				listOfMeals.set(i, mealForUpdate);
				return true;
			}
		}
		return false;
	}
	
	public static List<Meal> getAll() {
		return listOfMeals;
	}
	
	public static Meal getMealByTitle(String title){
		for(Meal meal : listOfMeals){
			if(meal.getTitle().equals(title)){
				return meal;
			}
		}
		return null;
	}
	
	public static Meal getMealByPrice(double price){
		for(Meal meal : listOfMeals){
			if(meal.getPrice() == price){
				return meal;
			}
		}
		return null;
	}
	
	public static Meal getMealById(long id){
		for(Meal meal : listOfMeals){
			if(meal.getId() == id){
				return meal;
			}
		}
		return null;
	}
}
