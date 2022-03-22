package com.java8.approaches;

import java.util.ArrayList;
import java.util.List;

import com.java8.approaches.util.Transaction;
import com.java8.approaches.util.TransactionUtils;

public class Approach_1 {

	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		
		List<Transaction> filteredTransactions = 
				filterTransactionsByLocation(allTransactions, "PUNE");
		TransactionUtils.printTransactions(filteredTransactions);

		System.out.println("\n\n");
		
		filteredTransactions = 
				filterTransactionsByAmount(allTransactions, 500);
		TransactionUtils.printTransactions(filteredTransactions);
	}
	public static List<Transaction> filterTransactionsByLocation(List<Transaction> 
				transactions, String location) {
		List<Transaction> puneTransactions = new ArrayList<Transaction>();
		for(Transaction transaction: transactions) {
			if (location.equals(transaction.getLocation())) {
				puneTransactions.add(transaction);
			}
		}
		return puneTransactions;
	}

	public static List<Transaction> filterTransactionsByAmount(List<Transaction> 
				transactions, double amount) {
		List<Transaction> amountTransactions = new ArrayList<Transaction>();
		for(Transaction transaction: transactions) {
			if (transaction.getAmount() > amount) {
				amountTransactions.add(transaction);
			}
		}
		return amountTransactions;
	}
}
