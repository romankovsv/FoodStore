package com.foodstore.serg.model;

import java.util.Date;

public class Desert extends Meal{

	boolean withSugar;

	public boolean isWithSugar() {
		return withSugar;
	}

	public void setWithSugar(boolean withSugar) {
		this.withSugar = withSugar;
	}
	
	
	public Desert(String title, String description, String type, boolean available, double price,
			String owner, Date date, boolean withSugar){
		super(title,description,type, available, price,owner, date);
		this.withSugar = withSugar;
	}
	
}
