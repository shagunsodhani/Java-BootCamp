package com.adobe.client;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new CharPrint());
		t1.start();
		
		NumberThread t2 = new NumberThread();
		t2.setDaemon(true);
		t2.start();
		
		test();

	}
	
	private static void test() {
		Thread t = Thread.currentThread();
		System.out.println("Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());
		System.out.println("Group: " + t.getThreadGroup().getName());
		System.out.println("Is Deamon: " + t.isDaemon());
	}

}
