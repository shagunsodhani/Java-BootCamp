/**
 * 
 */
package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shagun Sodhani
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list.add("BA");
		list.add("A");
		list.add("C");
		
		
		List<Integer> ilist = new ArrayList<Integer>();
		List<Integer> ilist2 = new ArrayList<Integer>();

		copy(list, list2);
		copy(ilist, ilist2);
		
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);	
		}
		
//		print(list);
	}
	

//	private static <T> void print(List<? super T> dest, List<T> src){
	private static <T> void copy(List<? super T> dest, List<? extends T> src){
		for (T object : src) {
			dest.add(object);
		}	
	}

//	unkonwn type - read only operations
	private static void print(List<?> list){
		
	}

}
