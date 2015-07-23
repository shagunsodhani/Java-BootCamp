package com.adobe.client;

public class BankExample {
	public static void main(String[] args){
		Account account = new Account(123.0);
		TransactionThread t2 = new TransactionThread(account, "Sheldon", 1024.0, TransactionType.DEBIT);
		TransactionThread t1 = new TransactionThread(account, "Penny", 1234.0, TransactionType.CREDIT);
		TransactionThread t3 = new TransactionThread(account, "Raj", 16.0, TransactionType.DEBIT);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
