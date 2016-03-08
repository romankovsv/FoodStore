package com.foodstore.serg.model;

public class Desert extends Meal{

	private boolean withSugar;

	public boolean isWithSugar() {
		return withSugar;
	}

	public void setWithSugar(boolean withSugar) {
		this.withSugar = withSugar;
	}
	
	
	public Desert(String title, String description, String type, boolean available, String price,
			String owner,boolean withSugar){
		super(title,description,type, available, price,owner);
		this.withSugar = withSugar;
	}
	
}
