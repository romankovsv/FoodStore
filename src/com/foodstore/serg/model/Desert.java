package com.foodstore.serg.model;

public class Desert extends Meal{

	private boolean withSugar;

	public boolean isWithSugar() {
		return withSugar;
	}

	public void withSugar(final boolean withSugar) {
		this.withSugar = withSugar;
	}
	
	public Desert(DesertBuilder builder){
		super(builder);
		this.withSugar = builder.isWithSugar();
	}
	
}
