package com.foodstore.serg.model;

import java.math.BigDecimal;

public abstract class  Meal {
	
	private long id;
	private String title;
	private String description;
	private String type;
	private Boolean available;
	private BigDecimal price;
	private String owner;
	private String time;	
	
	
	private static long countId = 0;
	
	public Meal(MealBuilder builder){
		this.id = builder.getId();
		this.title = builder.getTitle();
		this.description = builder.getDescription();
		this.type = builder.getType();
		this.available = builder.isAvailable();
		this.price = builder.getPrice();
		this.owner = builder.getOwner();
		this.time = builder.getTime();
	}
	

	static long setId(){
		countId++;
		return countId;
	}
	
	public long getId(){
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(String price) {
		if(price != null)
		this.price = new BigDecimal(price);
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTime() {
		return time;
	}
	
	@Override
	public String toString(){
		return "{"+"Title="+title+" Type="+type+" Price="+price+
				" Owner="+owner+" is Available="+available+"}";
	}
	
}
