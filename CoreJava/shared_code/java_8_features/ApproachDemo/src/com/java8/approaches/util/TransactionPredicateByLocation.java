package com.java8.approaches.util;

public class TransactionPredicateByLocation implements TransactionPredicate {
	private String location;
	public TransactionPredicateByLocation(String location) {
		this.location = location;
	}
	
	@Override
	public boolean test(Transaction transaction) {
		return transaction.getLocation().equals(this.location);
	}

}
