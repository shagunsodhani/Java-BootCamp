/**
 * 
 */
package com.adobe.dao.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.adobe.dao.ProductDao;
import com.adobe.entity.Product;
import com.adobe.exception.FetchException;
import com.adobe.exception.PersistenceException;

/**
 * @author ssodhani
 *
 */
public class ProductDaoFileImpl implements ProductDao {

	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#addProduct(com.adobe.entity.Product)
	 */
	@Override
	public void addProduct(Product product) throws PersistenceException {
//		try with resource - no need to write a finally block
		try (FileOutputStream fout = new FileOutputStream("products.txt", true);
				PrintStream ps = new PrintStream(fout);){
			ps.println(product.getId() + "," + product.getName() + "," + product.getPrice());
			
		} catch (IOException e) {
			throw new PersistenceException("unable to add product ", e);
		}

	}

	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#getAllProducts()
	 */
	@Override
	public List<Product> getAllProducts() throws FetchException {
		
		List<Product> list = new ArrayList<Product>();;
		try (FileInputStream fis = new FileInputStream("products.txt");
				InputStreamReader reader = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(reader);
				){
			String line = null;
			while( (line = br.readLine()) != null){
				String[] data = line.split(",");
				Product p = new Product(Integer.parseInt(data[0].trim()), data[1].trim(), Double.parseDouble(data[2].trim()));
				list.add(p);
			}
		} catch (IOException e) {
			throw new FetchException("unable to add product ", e);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#deleteProduct(int)
	 */
	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

}
