package com.adobe.sample.entity;

public class TV extends Product {
	private String screenType;

	/**
	 * 
	 */
	public TV() {
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param screenType
	 */
	public TV(int id, String name, double price, String screenType) {
		super(id, name, price);
		this.screenType = screenType;
	}

	/**
	 * @return the screenType
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType the screenType to set
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.entity.Product#isExpensive()
	 */
	@Override
	public boolean isExpensive() {
		boolean expensive = false;
		
		if(getPrice() > 15000 && screenType.equals("LED")){
			expensive = true;
		}
		else if (getPrice() > 3000 && screenType.equals("CRT")) {
			expensive = true;
		}
		
		return expensive;
	}
	
	
}
