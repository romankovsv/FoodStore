package com.foodstore.serg.model;

import java.util.Date;
import java.util.Objects;

import org.joda.time.DateTime;

import com.foodstore.serg.utils.TimeUtils;


public class Meal {
	
	private long id;
	private String title;
	private String description;
	private String type;
	private boolean available;
	private double price;
	private String owner;
	private String time;	
	
	
	private static long countId = 1;
	
	public Meal(String title, String description, String type, boolean available, double price,
			String owner, Date date){
		this.title = title;
		this.description= description;
		this.type = type;
		this.available = available;
		this.price = price;
		this.owner = owner;
		this.time = TimeUtils.getTime(date);
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public void setTime(Date date) {
		DateTime dateTime = new DateTime(date);
		this.time  =  String.valueOf(dateTime.getHourOfDay())+":"+String.valueOf(dateTime.getMinuteOfHour())
		+":"+String.valueOf(dateTime.secondOfMinute());
	
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
