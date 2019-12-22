package com.capgemini.shopping.daomanager;

import com.capgemini.shoppingapp.dao.ProductDAO;
import com.capgemini.shoppingapp.dao.ProductDAOImpl;

public class ProductDAOManager {
	public static ProductDAO getProductDAO() {
		return new ProductDAOImpl();
	}


}
