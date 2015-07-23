package com.adobe.client;

public class CharPrint implements Runnable {

	@Override
	public void run() {
		printChars();

	}

	private void printChars() {
		for (char ch = 'A'; ch < 'z'; ch++) {
			System.out.println(Thread.currentThread().getName()+ " : "+ch);			
		}
		
	}

}
