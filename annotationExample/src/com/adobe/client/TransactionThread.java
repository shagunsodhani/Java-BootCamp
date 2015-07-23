package com.adobe.client;

public class TransactionThread extends Thread {
	
	private Account account;
	private String name;
	private double amt;
	private TransactionType transactionType;
	/**
	 * @param account
	 * @param name
	 * @param amt
	 * @param transactionType
	 */
	public TransactionThread(Account account, String name, double amt,
			TransactionType transactionType) {
		this.account = account;
		this.name = name;
		this.amt = amt;
		this.transactionType = transactionType;
	}
	
	@Override
	public void run(){
		if(transactionType == TransactionType.CREDIT){
			account.deposit(name, amt);
		}
		if(transactionType == TransactionType.DEBIT){
			account.withdraw(name, amt);
		}
	}

}
