/**
 * 
 */
package com.adobe.sample.entity;

/**
 * @author ssodhani
 *
 */

public abstract class Product {
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	
	private int id;
	private String name;
	private double price;
	
	
	/**
	 * 
	 */
	public Product() {
	}


	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @return
	 * true if expensive else return false
	 */
	
	public abstract boolean isExpensive();

}
