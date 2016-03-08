package com.foodstore.serg.model;

public class MainCourse extends Meal{
	
	private String methodOfCooking;

	public String getMethodOfCooking() {
		return methodOfCooking;
	}

	public void setMethodOfCooking(String methodOfCooking) {
		this.methodOfCooking = methodOfCooking;
	}
	
	public MainCourse(String title, String description, String type, boolean available, String price,
			String owner, String methodOfCooking){
		super(title,description,type, available, price,owner);
		this.methodOfCooking = methodOfCooking;
	}
}
