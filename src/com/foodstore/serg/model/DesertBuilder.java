package com.foodstore.serg.model;

import java.math.BigDecimal;

import com.foodstore.serg.utils.TimeUtil;

public class DesertBuilder extends MealBuilder{
	
	
	private boolean withSugar;

	public boolean isWithSugar() {
		return withSugar;
	}
	
	public DesertBuilder withSugar(final boolean withSugar){
		this.withSugar = withSugar;
		return this;
	}
	
	@Override
	public DesertBuilder title(final String  title){
		this.title = title;
		return this;
	}
	
	@Override
	public DesertBuilder description(final String  description){
		this.description = description;
		return this;
	}
	
	@Override
	public DesertBuilder type(final String  type){
		this.type = type;
		return this;
	}
	
	@Override
	public DesertBuilder available(final Boolean available){
		this.available = available;
		return this;
	}
	
	@Override
	public DesertBuilder price(final String price){
		this.price = new BigDecimal(price);
		return this;
	}
	
	@Override
	public DesertBuilder time(){
		this.time = TimeUtil.getTime();
		return this;
	}
	
	@Override
	public DesertBuilder owner(final String  owner){
		this.owner = owner;
		return this;
	}
	
	@Override
	public DesertBuilder id(){
		this.id = Meal.setId();
		return this;
	}
	
	public Desert build(){
		return new Desert(this);
	}

}
