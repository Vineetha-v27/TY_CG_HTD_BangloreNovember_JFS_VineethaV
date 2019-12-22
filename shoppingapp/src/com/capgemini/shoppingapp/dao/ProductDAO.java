package com.capgemini.shoppingapp.dao;

import java.util.List;

import com.capgemini.shopping.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> showAllProducts();
	List<ProductBean> searchProduct(String productname);
	public boolean buyProduct(int productid,String cardnumber,int cvv);

}
