package com.java8.approaches.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewsUtils {

	public static List<News> getAllNewss() {
		List<News> newsList = new ArrayList<News>();
		Random random = new Random();
		for(int i=0; i<100; i++) {
			String commentArray[] = {"Good news", "Better news", "Bad news", "I do not wish to comment on budget", "Budget was well", "Everything we have similar budget"};
			String commentByUserArray[] = {"Azad", "Tarun", "Avanti", "Sam", "Meena"};
			String postedByUserArray[] = {"Tom", "Jerry", "Ivan"};
			newsList.add(new News(random.nextInt(5), postedByUserArray[random.nextInt(postedByUserArray.length)], commentByUserArray[random.nextInt(commentByUserArray.length)], commentArray[random.nextInt(commentArray.length)]));
		}
		return newsList;
	}
	
	public static void printNews(List<News> fruits) {
		for(News fruit: fruits) {
			System.out.println(fruit);
		}
	}
}







