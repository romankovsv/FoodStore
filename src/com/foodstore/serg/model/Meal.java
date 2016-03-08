package com.foodstore.serg.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.foodstore.serg.utils.TimeMealUtils;


public class Meal {
	
	private long id;
	private String title;
	private String description;
	private String type;
	private Boolean available;
	private BigDecimal price;
	private String owner;
	private String time;	
	
	
	private static long countId = 1;
	
	public Meal(String title, String description, String type, boolean available, String price,
			String owner){
		this.title = title;
		this.description= description;
		this.type = type;
		this.available = available;
		this.price = new BigDecimal(price);
		this.owner = owner;
		this.time = TimeMealUtils.getTime();
		id = setId();
	}
	

	private static long setId(){
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
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Meal){
			Meal otherMeal = (Meal)obj;
			return this.title.equals(otherMeal.title) && this.type.equals(otherMeal.type)
					&& this.price==otherMeal.price && this.owner.equals(otherMeal.owner) 
					&& this.available == otherMeal.available;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(title,type,price,owner,available);
	}

	
	
}
