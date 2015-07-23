package com.adobe.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adobe.dao.ProductDao;
import com.adobe.dao.ProductDaoDatabaseImpl;
import com.adobe.dao.file.ProductDaoFileImpl;
import com.adobe.entity.Product;
import com.adobe.exception.FetchException;
import com.adobe.exception.PersistenceException;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = "index.jsp";
		String uri = request.getRequestURI();
		if(uri!=null){
//			ProductDao productDao = new ProductDaoDatabaseImpl();
			ProductDao productDao = new ProductDaoFileImpl();
			
			if(uri.endsWith("listProducts.do")){
				try {
					request.setAttribute("products", productDao.getAllProducts());
					target = "list.jsp";
				} catch (FetchException e) {
					request.setAttribute("message", e.getMessage());
				}
			}else if (uri.endsWith("addProductsForm.do")){
				target = "addProduct.jsp";
			}else if(uri.endsWith("add.do")){
				Product p = new Product(Integer.parseInt(request.getParameter("id")), request.getParameter("name"), Double.parseDouble(request.getParameter("price")));
				
				try {
					productDao.addProduct(p);
				} catch (PersistenceException e) {
					request.setAttribute("message", e.getMessage());
				}
			}else if(uri.endsWith("delete.do")){
				productDao.deleteProduct(Integer.parseInt(request.getParameter("id")));
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
