package com.adobe.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callableTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = service.submit(new computeThread(1, 5000));
		Future<Integer> f2 = service.submit(new computeThread(1000, 6000));
		
//		if(f1.isDone()){
			try {
//				blocking call
				System.out.println(f1.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
//		if(f2.isDone()){
			try {
				System.out.println(f2.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
		service.shutdown();
		
	}

}
