package com.adobe.client;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class Account {

	private Double balance;

	public Double getBalance() {
		try {
			Thread.sleep((long) (Math.random() * 2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	private void setBalance(Double balance) {
		try {
			Thread.sleep((long) (Math.random() * 2000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
		notifyAll();
	}
	
	public synchronized void deposit(String name, double amt) {
		System.out.println(name + " depositing " + amt);
		System.out.println(name + " balance " + getBalance());
		System.out.println(name + " new balance " + (getBalance()+amt));
		setBalance(getBalance()+amt);
	}
	
	public synchronized void withdraw(String name, double amt) {
		while(getBalance() < amt){
			System.out.println("Insufficient Balance : "+getBalance());
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " withdraw " + amt);
		System.out.println(name + " balance " + getBalance());
		System.out.println(name + " new balance " + (getBalance()-amt));
		setBalance(getBalance()-amt);
	}

	/**
	 * @param balance
	 */
	public Account(Double balance) {
		this.balance = balance;
	}
	
}
