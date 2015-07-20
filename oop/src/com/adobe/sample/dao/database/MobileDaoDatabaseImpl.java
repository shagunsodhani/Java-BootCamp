/**
 * 
 */
package com.adobe.sample.dao.database;

import com.adobe.sample.dao.MobileDao;
import com.adobe.sample.entity.Mobile;

/**
 * @author ssodhani
 *
 */
public class MobileDaoDatabaseImpl implements MobileDao {

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.MobileDao#addMobile(com.adobe.sample.entity.Mobile)
	 */
	@Override
	public void addMobile(Mobile mobile) {
		System.out.println(mobile.getName() + " stored in db");
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.dao.MobileDao#deleteMobile(int)
	 */
	@Override
	public void deleteMobile(int id) {
		
		System.out.println("Deleted Mobile : " + id);

	}

}
