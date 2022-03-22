package com.java8.approaches;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.approaches.util.Transaction;
import com.java8.approaches.util.TransactionUtils;

public class Approach_5 {

	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		List<Transaction> filteredTransactions =
				allTransactions.stream().filter((Transaction t)->"PUNE".equals(t.getLocation())).
				collect(Collectors.toList());
TransactionUtils.printTransactions(filteredTransactions);				
		filteredTransactions =
				allTransactions.stream().filter((Transaction t)->t.getAmount() > 500).
				collect(Collectors.toList());
System.out.println("\n\n");
		TransactionUtils.printTransactions(filteredTransactions);				
				
	}

}



