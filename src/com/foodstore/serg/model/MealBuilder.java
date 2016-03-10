package com.foodstore.serg.model;

import java.math.BigDecimal;

import com.foodstore.serg.utils.TimeUtil;

public class MealBuilder {
	
	protected long id;
	protected String title;
	protected String description;
	protected String type;
	protected Boolean available;
	protected BigDecimal price;
	protected String owner;
	protected String time;
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public Boolean isAvailable() {
		return available;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public String getOwner() {
		return owner;
	}
	public String getTime() {
		return time;
	}	
	
	public MealBuilder title(final String  title){
		this.title = title;
		return this;
	}
	
	public MealBuilder description(final String  description){
		this.description = description;
		return this;
	}
	
	public MealBuilder type(final String  type){
		this.type = type;
		return this;
	}
	
	public MealBuilder available(final Boolean available){
		this.available = available;
		return this;
	}
	
	public MealBuilder price(final String price){
		this.price = new BigDecimal(price);
		return this;
	}
	
	public MealBuilder time(){
		this.time = TimeUtil.getTime();
		return this;
	}
	
	public MealBuilder owner(final String  owner){
		this.owner = owner;
		return this;
	}
	
	public MealBuilder id(){
		this.id = Meal.setId();
		return this;
	}
	
	
	
}
