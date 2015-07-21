package client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args){
		Map<String, Double> bookMap = new HashMap<String, Double>();
		
		bookMap.put("java", 1.0);
		bookMap.put("cpp", 2.0);
		bookMap.put("js", 3.0);
		
		System.out.println(bookMap.containsKey("java"));
		System.out.println(bookMap.get("java"));
		
		Set<String> set = bookMap.keySet();
		
		for(String s : set){
			System.out.println(s);
			System.out.println(bookMap.get(s));
		}
		
		Set<Entry<String, Double>> entries = bookMap.entrySet();
		
		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}
