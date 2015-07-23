package com.adobe.client;

public class NumberThread extends Thread {
	
	@Override
	public void run(){
		print();
	}

	private void print() {
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}

}
