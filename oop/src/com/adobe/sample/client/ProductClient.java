/**
 * 
 */
package com.adobe.sample.client;

import com.adobe.sample.entity.Mobile;
import com.adobe.sample.entity.Product;
import com.adobe.sample.entity.TV;

/**
 * @author ssodhani
 *
 */
public class ProductClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product[] products = new Product[4];
//		Not instantiating an abstract class, just referring to it
		
		products[0] = new TV(1, "Sony Bravia", 65000, "LED");//upcasting - top entry can point to any low lying entry
		products[1] = new Mobile(2, "MotoG", 12999, "3G");
		products[2] = new TV(3, "LG Joy", 29000, "LED");
		products[3] = new Mobile(4, "iPhone 6", 65000, "3G");
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + " : " + products[i].getPrice());
			
			if(products[i] instanceof TV){
				TV t = (TV) products[i];
				System.out.println(t.getScreenType());
			}
			
			if (products[i].getClass() ==  Mobile.class){
				//prefer - exact checking
				Mobile m = (Mobile) products[i];
				System.out.println(m.getConnectivity());
			}
			
			if(products[i].isExpensive()){
				System.out.println("Expensive");
			}
			else{
				System.out.println("Not expensive");
			}
			
		}
	}

}
