package com.adobe.sample.client;

import com.adobe.sample.dao.MobileDao;
import com.adobe.sample.dao.MobileDaoFactory;
import com.adobe.sample.entity.Mobile;

public class MobileClient {

	public static void main(String[] args){
		Mobile m = new Mobile(1, "Samsung s6", 56000, "3G" );
		
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		
		mobileDao.addMobile(m);
		
		mobileDao.deleteMobile(1);
		
	}
}
