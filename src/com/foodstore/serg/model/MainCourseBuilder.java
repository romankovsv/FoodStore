package com.foodstore.serg.model;

import java.math.BigDecimal;

import com.foodstore.serg.utils.TimeUtil;

public class MainCourseBuilder extends MealBuilder{
	
	
	private String methodOfCooking;

	public String getMethodOfCooking() {
		return methodOfCooking;
	}
	
	public MainCourseBuilder methodOfCooking(final String methodOfCooking){
		this.methodOfCooking = methodOfCooking;
		return this;
	}
	
	@Override
	public MainCourseBuilder title(final String  title){
		this.title = title;
		return this;
	}
	
	@Override
	public MainCourseBuilder description(final String  description){
		this.description = description;
		return this;
	}
	
	@Override
	public MainCourseBuilder type(final String  type){
		this.type = type;
		return this;
	}
	
	@Override
	public MainCourseBuilder available(final Boolean available){
		this.available = available;
		return this;
	}
	
	@Override
	public MainCourseBuilder price(final String price){
		this.price = new BigDecimal(price);
		return this;
	}
	
	@Override
	public MainCourseBuilder time(){
		this.time = TimeUtil.getTime();
		return this;
	}
	
	@Override
	public MainCourseBuilder owner(final String  owner){
		this.owner = owner;
		return this;
	}
	
	@Override
	public MainCourseBuilder id(){
		this.id = Meal.setId();
		return this;
	}
	
	
	public MainCourse build(){
		return new MainCourse(this);
	}
}
