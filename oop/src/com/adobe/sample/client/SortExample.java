package com.adobe.sample.client;

import com.adobe.sample.entity.Account;
import com.adobe.sample.utility.Utility;

public class SortExample {
	
	public static void main(String[] args){
		Account[] accounts = new Account[3];
		accounts[0] = new Account("SB190");
		accounts[1] = new Account("SB170");
		accounts[2] = new Account("SB100");
		
		accounts[0].deposite(4500);
		accounts[1].deposite(2500);
		accounts[2].deposite(3500);
		
		Utility.sort(accounts);
		
		for(Account account : accounts){
			System.out.println(account.getAccNo() + " : " + account.getBalance());
		}
	}

}
