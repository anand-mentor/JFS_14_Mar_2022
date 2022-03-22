package com.java8.approaches.util;

import java.util.Date;
import java.util.UUID;

public class Transaction {

	private String id;
	private Date time;
	private int amount;
	private String location;
	
	public Transaction() { }

	public Transaction(int amount) {
		this.id = UUID.randomUUID().toString();
		this.time = new Date();
		this.amount = 0;
		this.location = "No location";
	}
	
	public Transaction(Date time, String location) {
		this.id = UUID.randomUUID().toString();
		this.time = time;
		this.amount = 0;
		this.location = location;
	}
	
	public Transaction(Date time, int amount, String location) {
		this.id = UUID.randomUUID().toString();
		this.time = time;
		this.amount = amount;
		this.location = location;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		//return " - " + time + " -" + amount + " - " + location;
		return location + ":  Rs. " + amount + "/-  " + time;
	}
}
