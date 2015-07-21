package client;

import java.util.Date;

import com.adobe.util.DateUtil;
import com.adobe.util.KeyboardUtil;

public class Test {

	public static void main(String[] args){
		String str = KeyboardUtil.getString("Enter Date :");
		Date d = DateUtil.getDate(str);
		String s = DateUtil.toString(d);
		
		System.out.println(s);
	}
}
