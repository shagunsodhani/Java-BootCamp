package com.adobe.client;

import java.util.concurrent.Callable;

public class computeThread implements Callable<Integer>{

	private Integer start;
	private Integer end;
	
	
	/**
	 * @param start
	 * @param end
	 */
	public computeThread(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}


	@Override
	public Integer call() throws Exception {
		Integer sum = 0;
		for (Integer i = start; i <= end; i++) {
			sum+=i;
		}
		return sum;
	}

}
