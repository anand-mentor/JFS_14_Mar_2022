package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DessertItem {
	private double tax;
	public double cost;
	public double conversionRate;
	public DessertItem(double tax, double cost, double conversionRate) {
		this.tax = tax;
		this.cost = cost;
		this.conversionRate = conversionRate;
	}
	public abstract double getCost();
}
class Candy extends DessertItem {
	public Candy(double tax, double cost, double conversionRate) {
		super(tax, cost, conversionRate);
	}
	@Override
	public double getCost() {
		return super.cost*super.conversionRate;
	}
}
class Cookie extends DessertItem {
	public Cookie(double tax, double cost, double conversionRate) {
		super(tax, cost, conversionRate);
	}
	@Override
	public double getCost() {
		return 0;
	}
}
class IceCream extends DessertItem {
	public IceCream(double tax, double cost, double conversionRate) {
		super(tax, cost, conversionRate);
	}
	@Override
	public double getCost() {
		return 0;
	}
}
public class DessertShop {

	static Scanner scanner = new Scanner(System.in);
	private static List<Candy> candies = new ArrayList<Candy>();
	private static List<Cookie> cookies = new ArrayList<Cookie>();
	private static List<IceCream> icecreams = new ArrayList<IceCream>();
	
	public static void owner() {
		//if owner says he/she wants to add 100 candies-
		for(int i=0;i<100;i++)
			candies.add(new Candy(10, 20, 60));
	}
	public static void customer() {
		//get information about customer order like 2-candies, 3-cookies, 10-icecreams
	}
	public static void main(String[] args) {
		System.out.println("Enter role: 1-owner, 2-customer");
		while(true) {
			int role = scanner.nextInt();
			switch(role) {
				case 1: owner(); break;
				case 2: customer(); break;
				default: System.out.println("Invalid role");
			}
		}
	}

}
