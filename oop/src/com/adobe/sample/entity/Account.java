/**
 * 
 */
package com.adobe.sample.entity;

import com.adobe.sample.utility.IComparable;

/**
 * Account class represents entity
 * @author ssodhani
 *
 */
public class Account implements IComparable<Account>{
	
	private String accNo; //state of object - instance variable
	
	private double balance; //state of object - instance variable
	
	private static int count;  //state of class - class variable
	
	/**
	 * @param accNo account Number
	 */
	public Account(String accNo) {
		count++;
		this.accNo = accNo;
	}
	
	/**
	 * 
	 * @param amt amount to be deposited
	 */
	public void deposite(double amt) {
		this.balance +=amt;
	}
	
	/**
	 * Method to return current balance
	 * @return current balance
	 */
	public double getBalance(){
		return this.balance;
	}
	
	/**
	 * Method to return account number
	 * @return accountumber
	 */
	public String getAccNo() {
		return this.accNo;
	}
	
	public static int getCount(){
		return count;
	}

	@Override
	public int compareTo(Account other) {
		
		int diff = Double.compare(this.balance, other.balance);
		if(diff == 0){
			diff = this.accNo.compareTo(other.accNo);
		}
		return diff;
	}
	
}
