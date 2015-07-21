/**
 * 
 */
package com.adobe.entity;

import java.util.Comparator;

/**
 * @author Shagun Sodhani
 *
 */
public class Book implements Comparable<Book> {
	
	private String title;
	private double price;
	
	

	/**
	 * 
	 */
	public Book() {
	}



	/**
	 * @param title
	 * @param price
	 */
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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



	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}
	
	public static Comparator<Book> PRICE_COMP = new Comparator<Book>() {
		
		@Override
		public int compare(Book o1, Book o2){
			int diff = Double.compare(o1.price, o2.price);
			if(diff == 0){
				diff = o1.compareTo(o2);
			}
			return diff;
		}
	};



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
