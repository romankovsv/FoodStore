package com.foodstore.serg.model;

public class Desert extends Meal{
	
	public Desert(DesertBuilder builder){
		super(builder);
		this.withSugar = builder.isWithSugar();
	}

	private boolean withSugar;

	public boolean isWithSugar() {
		return withSugar;
	}

	public void withSugar(final boolean withSugar) {
		this.withSugar = withSugar;
	}
	

	
}
