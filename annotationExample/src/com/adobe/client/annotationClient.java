package com.adobe.client;

import java.util.Date;

import com.adobe.dbhelper.SQLUtil;
import com.adobe.entity.Employee;

public class annotationClient {
	
	public static void main(String[] args){
		String createSQL = SQLUtil.generateCreateSQL(Employee.class);
		System.out.println(createSQL);
		
		Employee e = new Employee(1, "dummy", new Date());
		String insertSQL = SQLUtil.generateInsertSQL(e);
		System.out.println(insertSQL);
	}

}
