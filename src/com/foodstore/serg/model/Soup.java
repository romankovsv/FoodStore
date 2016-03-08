package com.foodstore.serg.model;

public class Soup extends Meal{
	private String color;
	
	public Soup(String title, String description, String type, boolean available, String price,
			String owner, String color){
		super(title,description,type, available, price,owner);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
