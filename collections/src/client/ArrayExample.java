package client;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExample {
	
	public static void main(String[] args){
		String [] names = {"AA", "b", "c", "C", "E", "D"};
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int diff = o1.length() - o2.length();
				if(diff == 0)
				{
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		});
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
