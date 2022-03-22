package com.java8.approaches.util;

public class Order {
	private String location;
	private int price;
	
	public Order() {}

	public Order(String location, int price) {
		this.location = location;
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return location + " - " + price;
	}
}
