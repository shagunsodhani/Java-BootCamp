/**
 * 
 */
package com.adobe.sample.entity;

/**
 * @author ssodhani
 *
 */
public class Mobile extends Product {
	private String connectivity;

	/**
	 * 
	 */
	public Mobile() {
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param connectivity
	 */
	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}

	/**
	 * @return the connectivity
	 */
	public String getConnectivity() {
		return connectivity;
	}

	/**
	 * @param connectivity the connectivity to set
	 */
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	/* (non-Javadoc)
	 * @see com.adobe.sample.entity.Product#isExpensive()
	 */
	
	@Override
	public boolean isExpensive() {
		boolean expensive = false;
		
		if(getPrice() > 15000 && connectivity.equals("3G")){
			expensive = true;
		}
		else if (getPrice() > 3000 && connectivity.equals("2G")) {
			expensive = true;
		}
		
		return expensive;
	}
	
	

}
