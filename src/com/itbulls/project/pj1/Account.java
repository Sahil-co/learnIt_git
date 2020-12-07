package com.itbulls.project.pj1;

public class Account {

	private static final int DEFAULT_TRANSACTIONS_AMOUNT = 10;
	
	private int id;
	private Transaction[] transactions;
	private int lastTransactionIndex;

	{
		transactions = new Transaction[DEFAULT_TRANSACTIONS_AMOUNT];
	}

	public Account(int id) {
		this.id = id;
	}
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    <write your code here>
	}

	public void withdrawMoney(double moneyAmount) {
		<write your code here>
	}

	public Transaction[] getTransactions() {
		<write your code here>
	}

	public static class Transaction {

		public static Account accountFrom() {

		}

		public static Account accountTo() {

		}
	}
}
