package com.foodstore.serg.model;

import java.util.Date;

public class Soup extends Meal{
	private String color;
	
	public Soup(String title, String description, String type, boolean available, double price,
			String owner, Date date, String color){
		super(title,description,type, available, price,owner, date);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
