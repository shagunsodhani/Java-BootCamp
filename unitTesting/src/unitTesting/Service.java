package unitTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Service {
	
	private List<String> strList = new ArrayList<String>();
	private Set<String> strSet = new TreeSet<String>();
	
	public void addList(String str){
		strList.add(str);
	}
	
	public boolean addSet(String str){
		return strSet.add(str);
	}
	
	public void sortList(){
		Collections.sort(strList);
	}
	
	public List<String> getList(){
		return strList;
	}
	
	public Set<String> getSet(){
		return strSet;
	}

}
