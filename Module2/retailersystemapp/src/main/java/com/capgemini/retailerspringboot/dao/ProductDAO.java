package com.capgemini.retailerspringboot.dao;

import java.util.List;

import com.capgemini.retailerspringboot.dto.Authentication;
import com.capgemini.retailerspringboot.dto.ProductInfo;

public interface ProductDAO {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

	public boolean deleteProduct(int id);

	public boolean modifyProduct(int id, String name);

	public boolean register(Authentication account);

	public Authentication login(Authentication credentials);

}
