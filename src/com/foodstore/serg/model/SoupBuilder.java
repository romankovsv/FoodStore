package com.foodstore.serg.model;

import java.math.BigDecimal;

import com.foodstore.serg.utils.TimeUtil;

public class SoupBuilder extends MealBuilder{

	
	private String color;
	
	public String getColor() {
		return color;
	}
	
	public SoupBuilder color(final String color){
		this.color = color;
		return this;
	}
	
	@Override
	public SoupBuilder title(final String  title){
		this.title = title;
		return this;
	}
	
	@Override
	public SoupBuilder description(final String  description){
		this.description = description;
		return this;
	}
	
	@Override
	public SoupBuilder type(final String  type){
		this.type = type;
		return this;
	}
	
	@Override
	public SoupBuilder available(final Boolean available){
		this.available = available;
		return this;
	}
	
	@Override
	public SoupBuilder price(final String price){
		this.price = new BigDecimal(price);
		return this;
	}
	
	@Override
	public SoupBuilder time(){
		this.time = TimeUtil.getTime();
		return this;
	}
	
	@Override
	public SoupBuilder owner(final String  owner){
		this.owner = owner;
		return this;
	}
	
	@Override
	public SoupBuilder id(){
		this.id = Meal.setId();
		return this;
	}
	

	public Soup build(){
		return new Soup(this);
	}
}
