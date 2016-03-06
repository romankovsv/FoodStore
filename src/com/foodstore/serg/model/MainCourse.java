package com.foodstore.serg.model;

import java.util.Date;

public class MainCourse extends Meal{
	
	String methodOfCooking;

	public String getMethodOfCooking() {
		return methodOfCooking;
	}

	public void setMethodOfCooking(String methodOfCooking) {
		this.methodOfCooking = methodOfCooking;
	}
	
	public MainCourse(String title, String description, String type, boolean available, double price,
			String owner, Date date, String methodOfCooking){
		super(title,description,type, available, price,owner, date);
		this.methodOfCooking = methodOfCooking;
	}
}
