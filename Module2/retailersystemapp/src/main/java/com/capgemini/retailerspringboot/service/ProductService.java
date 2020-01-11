package com.capgemini.retailerspringboot.service;

import java.util.List;

import com.capgemini.retailerspringboot.dto.ProductInfo;

public interface ProductService {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

	public boolean deleteProduct(int id);

	public boolean modifyProduct(int id, String name);

}
