package com.capgemini.retailerspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailerspringboot.dao.ProductDAO;
import com.capgemini.retailerspringboot.dto.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productdao;

	@Override
	public boolean addProduct(ProductInfo product) {
		return productdao.addProduct(product);
	}

	@Override
	public ProductInfo getProduct(int id) {
		return productdao.getProduct(id);
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		return productdao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(int id) {
		return productdao.deleteProduct(id);
	}

	@Override
	public boolean modifyProduct(int id, String name) {
		return productdao.modifyProduct(id, name);
	}

}
