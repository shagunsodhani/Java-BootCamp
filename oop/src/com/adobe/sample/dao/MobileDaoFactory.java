package com.adobe.sample.dao;

import java.util.ResourceBundle;

public abstract class MobileDaoFactory {
	
//	Mark as abstract to prevent anyone else from instantiating
	
	private static String MOBILE_DAO = "" ;
	
//	since a string, can externalize it - flat file change
	
//	this code is executed as soon as class is called
	static {
		ResourceBundle res = ResourceBundle.getBundle("database");
		MOBILE_DAO = res.getString("MOBILE_DAO").trim();
		
	}
	
	public static MobileDao getMobileDao(){
		try {
			return (MobileDao) Class.forName(MOBILE_DAO).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
