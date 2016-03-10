package com.foodstore.serg.model;

public class MainCourse extends Meal{
	
	private String methodOfCooking;

	public String getMethodOfCooking() {
		return methodOfCooking;
	}

	public void setMethodOfCooking(String methodOfCooking) {
		this.methodOfCooking = methodOfCooking;
	}
	
	public MainCourse(MainCourseBuilder builder){
		super(builder);
		this.methodOfCooking = builder.getMethodOfCooking();
	}
}
