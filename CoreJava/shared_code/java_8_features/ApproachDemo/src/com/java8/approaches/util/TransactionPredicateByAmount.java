package com.java8.approaches.util;

public class TransactionPredicateByAmount 
implements TransactionPredicate {

	@Override
	public boolean test(Transaction t) {
		return t.getAmount() > 500;
	}

}
