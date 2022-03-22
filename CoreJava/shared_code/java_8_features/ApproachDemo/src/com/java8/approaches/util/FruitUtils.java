package com.java8.approaches.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class FruitUtils {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		Random random = new Random();
		for(int i=0; i<100; i++) {
			String fruitNames[] = {"Peach", "Banana", "Pomegranate", "Apple", "Watermelon"};
			String fruitColors[] = {"Red", "White", "Yellow"};
			fruits.add(new Fruit(fruitNames[random.nextInt(4)], random.nextInt(500), random.nextInt(100), fruitColors[random.nextInt(2)]));
		}
		return fruits;
	}
	
	public static void printFruits(List<Fruit> fruits) {
		for(Fruit fruit: fruits) {
			System.out.println(fruit);
		}
	}
}







