package com.foodstore.serg.model;

public class Soup extends Meal{
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Soup(SoupBuilder builder){
		super(builder);
		this.color = builder.getColor();
	}
	
	

	
}
