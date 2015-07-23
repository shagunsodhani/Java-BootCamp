package com.adobe.dbhelper;

import java.lang.reflect.Method;
import java.util.Date;

import com.adobe.annotation.Column;
import com.adobe.annotation.Table;

public class SQLUtil {
	
	public static String generateCreateSQL(Class<?> clazz){
		StringBuilder builder = new StringBuilder("create table");
		
		Table table = clazz.getAnnotation(Table.class);
		
		if (table != null){
			builder.append(table.name());
			builder.append("(");
			
			Method[] methods = clazz.getDeclaredMethods();
			for (Method m : methods) {
				Column c = m.getAnnotation(Column.class);
				if(c!=null){
					builder.append(c.name());
					builder.append(" ");
					builder.append(c.type());
					builder.append(",");
				}
			}
		}
		builder.setCharAt(builder.lastIndexOf(","), ')');
		return builder.toString();
	}
	
	public static String generateInsertSQL(Object obj){
		StringBuilder builder = new StringBuilder("insert into ");
		
		Table table = obj.getClass().getAnnotation(Table.class);
		
		if (table != null){
			builder.append(table.name());
			builder.append("values (");
			
			Method[] methods = obj.getClass().getDeclaredMethods();
			for (Method m : methods) {
				
				if (m.getName().startsWith("get")){
					try {
						Object ret = m.invoke(obj, new Object[] {});
						if(ret instanceof String || ret instanceof Date){
							builder.append("'");
							builder.append(ret);
							builder.append("'");
						}
						else{
							builder.append(ret);
						}
						builder.append(",");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		builder.setCharAt(builder.lastIndexOf(","), ')');
		return builder.toString();
	}

}
