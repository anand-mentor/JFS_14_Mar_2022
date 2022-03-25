package com.java8.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
class AccountNameComparator implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
*/
class Account implements Comparable<Account> {
	String name;
	double balance;
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
	@Override
	public String toString() {
		return this.name + " - " + this.balance;
	}
	@Override
	public int compareTo(Account account) {
		if(this.balance > account.balance)
			return -1;
		else if(this.balance < account.balance)
			return 1;
		else
			return 0;
	}
}
public class StreamTest {

	public static void main(String[] args) {
		
		List<String> studentList = Arrays.asList("Sara", "Anand", "Tom", "Ivan", "Tom");
		List<String> oddNameStudentList = studentList.stream().filter((String name)->name.length()%2!=0).distinct().skip(1).limit(1).collect(Collectors.toList());
		
		List<String> sortedStudentList = studentList.stream().sorted().collect(Collectors.toList());

		List<Integer> numbers = Arrays.asList(5, 10, 15);
		int totalSum = numbers.stream().reduce(0, Integer::sum);
		Optional<Integer> opMaxNo = numbers.stream().reduce(Integer::max);
		int maxNo = opMaxNo.get();
		
		Consumer<Integer> consumer = (Integer x)->System.out.println(x);
		numbers.stream().forEach(consumer);
		
		List<Integer> temperatures = Arrays.asList(32, 34, 40, 37);
		boolean isHot = temperatures.stream().noneMatch((Integer temperature)->temperature>40);
		
		
		UnaryOperator<Integer> unaryOperator = (Integer x)->x*x;
		Stream.iterate(2, unaryOperator).limit(5).forEach(System.out::println);
		

		
		List<Account> accountList = 
				Arrays.asList(new Account("Tom", 10000), new Account("Jerry", 5000), new Account("Ivan", 4000)); //Collection
		Function<Account, Double> func = (Account account)->account.getBalance();
		
		//Comparator<Account> accNameComparator = (Account acc1, Account acc2)->acc2.getName().compareTo(acc1.getName());
		Comparator<Account> accNameComparator = Comparator.comparing(Account::getName).reversed();
		
		/*
		Comparator<Account> accBalanceComparator = (Account acc1, Account acc2)-> {
			if(acc1.getBalance()>acc2.getBalance())
				return 1;
			else if(acc1.getBalance()<acc2.getBalance())
				return -1;
			else
				return 0;
		};
		*/
		Comparator<Account> accBalanceComparator = Comparator.comparing(Account::getBalance).reversed();

		List<Account> sortedAccountList = accountList.stream().sorted(accBalanceComparator).collect(Collectors.toList());
		
		List<Double> accountBalanceList = accountList.stream().map(func).collect(Collectors.toList());
		
		Function<Account, String> nameFunc = (Account account)->account.getName();
		List<String> accountNameList = accountList.stream().map(nameFunc).collect(Collectors.toList());
		
		Stream<Account> stream = accountList.stream();//convert collection into a stream
		stream = stream.filter((Account account)->account.getName().length()>=4); //process the stream
		List<Account> filteredList = stream.collect(Collectors.toList()); //convert stream into java collection
		System.out.println("filteredList: " + filteredList);

filteredList = accountList.stream().filter((Account account)->account.getName().length()>=4).collect(Collectors.toList());
/*
for(Account acc: accountList) {
	System.out.println(acc);
}
for(Account acc: accountList) {
	System.out.println(acc);
}
*/
Stream<Account> stream_2 = accountList.stream(); //convert collection into a stream
stream_2.forEach((Account account)->System.out.println(account));
//stream_2.forEach((Account account)->System.out.println(account));
	}

}
