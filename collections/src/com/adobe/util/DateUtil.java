package com.adobe.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date getDate(String str){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
	
	public static String toString(Date d){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(d);
	}
	
}
