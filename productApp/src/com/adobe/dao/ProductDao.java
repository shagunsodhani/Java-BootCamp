package com.adobe.dao;

import java.util.List;

import com.adobe.entity.Product;
import com.adobe.exception.FetchException;
import com.adobe.exception.PersistenceException;

public interface ProductDao {
	
	void addProduct(Product product) throws PersistenceException;
	
	List<Product> getAllProducts() throws FetchException;
	
	void deleteProduct(int productId);
}
