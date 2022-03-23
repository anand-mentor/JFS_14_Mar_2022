package com.java8.approaches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
	public int operation(int x, int y);
}
@FunctionalInterface
interface StringOpr {
	int getLength(String str);
}

public class LambdaTest {

	public static void printList(List<String> listOfStr, Consumer<String> consumer) {
		for(String str: listOfStr) {
			consumer.accept(str);
		}
	}
	public static List<String> filterStrings(List<String> listOfStrs, 
			Predicate<String> predicate) {
		List<String> listOfNonEmptyStrings = new ArrayList<String>();
		for(String str: listOfStrs) {
			if(predicate.test(str)) {
				listOfNonEmptyStrings.add(str);
			}
		}
		return listOfNonEmptyStrings;
	}
	public static void main(String[] args) {

		List<String> listOfStrs = Arrays.asList("Zensar", "", "Infosys", "", "Accenture");
		
		Consumer<String> consoleConsumer = (String str)->System.out.println(str);
		printList(listOfStrs, consoleConsumer);
		
		
		Predicate<String> nonEmptyStringPredicate = (String str)->!str.isEmpty();
		List<String> listOfNonEmptyStrings = filterStrings(listOfStrs, 
				nonEmptyStringPredicate);
		System.out.println("listOfNonEmptyStrings : " + listOfNonEmptyStrings);
		
		Predicate<String> emptyStringPredicate = (String str)->str.isEmpty();
		List<String> listOfEmptyStrings = filterStrings(listOfStrs, 
				emptyStringPredicate);
		System.out.println("listOfNonEmptyStrings : " + listOfEmptyStrings);
		
		
		
		
		
		
		//StringOpr stringOpr = (String str)->str.length();
		//System.out.println("Length of Zensar is: " + stringOpr.getLength("Zensar"));
		//System.out.println("Length of IBM is: " + stringOpr.getLength("IBM"));
		
		Function<String, Integer> func = (String str)->str.length();
		System.out.println("Length of Zensar is: " + func.apply("Zensar"));
		System.out.println("Length of IBM is: " + func.apply("IBM"));

		BiFunction<Integer, Integer, Integer> biFunc= (x, y)->x + y;
		System.out.println("Addition: " + biFunc.apply(5, 10));
		
		//MathOperation addition = (int x, int y)->x + y;
		MathOperation subtraction = (int x, int y)->x - y;
		MathOperation multiplication = (int x, int y)->x * y;
		MathOperation division = (int x, int y)->x / y;
		
		//System.out.println("Addition: " + addition.operation(5, 10));
		System.out.println("Subtraction: " + subtraction.operation(5, 10));
	}

}
