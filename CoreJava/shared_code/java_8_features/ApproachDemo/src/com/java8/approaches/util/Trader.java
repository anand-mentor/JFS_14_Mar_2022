package com.java8.approaches.util;

public class Trader {
	public String name; 
	public String city;
	public Trader() {}
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
