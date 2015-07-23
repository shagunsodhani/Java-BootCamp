package com.adobe.entity;

import java.util.Date;

import com.adobe.annotation.Column;
import com.adobe.annotation.Table;

@Table(name = "EMP")
public class Employee {
	
	private int id;
	private String name;
	private Date hireDate;
	
	
	/**
	 * @param id
	 * @param name
	 * @param hireDate
	 */
	public Employee(int id, String name, Date hireDate) {
		this.id = id;
		this.name = name;
		this.hireDate = hireDate;
	}
	
	@Column(name="EMP_ID", type="NUMBER(5)")
	public int getId() {
		return id;
	}

	@Column(name="EMP_NAME")
	public String getName() {
		return name;
	}

	@Column(name="HIRE_DATE", type="TIMESTAMP")
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
