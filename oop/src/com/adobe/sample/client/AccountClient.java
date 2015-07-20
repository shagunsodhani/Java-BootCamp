/**
 * 
 */
package com.adobe.sample.client;

import com.adobe.sample.entity.Account;

/**
 * @author ssodhani
 *
 */
public class AccountClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Account.getCount());
		
		Account first = new Account("SB100");
		Account second = new Account("SB101");
		
		first.deposite(5000);
		second.deposite(2500.00);
		
		System.out.println(first.getAccNo() + " : " + first.getBalance());
		
		System.out.println(second.getAccNo() + " : " + second.getBalance());
		
		System.out.println(Account.getCount());
	}

}
