package com.adobe.sample.utility;

public class Utility {
	
//	OCP
	public static void sort(IComparable[] elems){
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems.length; j++) {
				if(elems[i].compareTo(elems[j]) > 0){
					IComparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}

}
