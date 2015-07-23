/**
 * 
 */
package com.adobe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.adobe.dao.db.DBConfig;

/**
 * @author ssodhani
 *
 */
public class DBUtil {
	
//	Should not be hardcoded
	private static String DRIVER = DBConfig.getString("DBUtil.DRIVER") ; //$NON-NLS-1$
	private static String URL = DBConfig.getString("DBUtil.URL"); //$NON-NLS-1$
	private static String USER = DBConfig.getString("DBUtil.USER"); //$NON-NLS-1$
	private static String PWD = DBConfig.getString("DBUtil.PWD"); //$NON-NLS-1$
	
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		try {
			return DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void closeConnection(Connection con){
		if (con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
