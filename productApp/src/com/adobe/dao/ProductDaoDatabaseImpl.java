/**
 * 
 */
package com.adobe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.adobe.entity.Product;
import com.adobe.exception.FetchException;
import com.adobe.exception.PersistenceException;

/**
 * @author ssodhani
 *
 */
public class ProductDaoDatabaseImpl implements ProductDao {

	private static final String INSERT_PRODUCT = "INSERT INTO product (ID, NAME, PRICE) VALUES (?, ?, ?)";
	private static final String SELECT_PRODUCT = "SELECT ID, NAME, PRICE FROM product";
	private static final String DELETE_PRODUCT = "DELETE FROM product WHERE ID = ?";
	
	
	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#addProduct(com.adobe.entity.Product)
	 */
	@Override
	public void addProduct(Product product) throws PersistenceException {
		Connection con = DBUtil.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(INSERT_PRODUCT);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setDouble(3, product.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenceException("unable to add product "+ product.getName(), e);
		} finally{
			DBUtil.closeConnection(con);
		}
	}

	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#getAllProducts()
	 */
	@Override
	public List<Product> getAllProducts() throws FetchException {
		

		List<Product>list  = new ArrayList<Product>();
		
		Connection conn = DBUtil.getCon();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_PRODUCT);
			while(rs.next()){
				Product product = new Product(rs.getInt("ID"), rs.getString("NAME"), rs.getDouble("PRICE"));
				list.add(product);
			}
		} catch (SQLException e) {
			throw new FetchException("unable to fetch products", e);
		}
		
		return list;
	}

	/* (non-Javadoc)
	 * @see com.adobe.dao.ProductDao#deleteProduct(int)
	 */
	@Override
	public void deleteProduct(int productId) {
		Connection con = DBUtil.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(DELETE_PRODUCT);
			ps.setInt(1, productId);
			ps.executeUpdate();
		} catch (SQLException e) {
		} finally{
			DBUtil.closeConnection(con);
		}

	}

}
