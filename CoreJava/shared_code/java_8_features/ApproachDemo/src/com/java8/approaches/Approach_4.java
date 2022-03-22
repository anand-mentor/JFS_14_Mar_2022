package com.java8.approaches;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java8.approaches.util.Transaction;
import com.java8.approaches.util.TransactionPredicate;
import com.java8.approaches.util.TransactionUtils;

public class Approach_4 {

	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		
		//Lambda expression
		TransactionPredicate predicateLocation = 
				(Transaction t) -> "PUNE".equals(t.getLocation());
		TransactionPredicate predicateAmount = 
				(Transaction t) -> t.getAmount() > 500;	
		
		List<Transaction> filteredTransactions = 
				filterTransactions(allTransactions, predicateLocation);
		TransactionUtils.printTransactions(filteredTransactions);

		System.out.println("\n\n");
		
		filteredTransactions = 
				filterTransactions(allTransactions, predicateAmount);
		TransactionUtils.printTransactions(filteredTransactions);
	}

	public static List<Transaction> filterTransactions(List<Transaction> transactions, TransactionPredicate predicate) {
		List<Transaction> filteredTransactions = new ArrayList<Transaction>();
		for(Transaction transaction: transactions) {
			if (predicate.test(transaction)) {
				filteredTransactions.add(transaction);
			}
		}
		return filteredTransactions;
	}
	
}



