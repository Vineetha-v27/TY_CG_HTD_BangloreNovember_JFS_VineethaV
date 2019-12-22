package com.capgemini.shopping.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.shopping.bean.ProductBean;
import com.capgemini.shopping.daomanager.ProductDAOManager;
import com.capgemini.shoppingapp.dao.ProductDAO;

public class MainApp {
	public static void main(String[] args) {
		ProductDAO dao = ProductDAOManager.getProductDAO();
		Scanner sc = new Scanner(System.in);
		ProductBean bean = new ProductBean();
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("Press 1 to Show All The Contacts");
			System.out.println("Press 2 to Search for Product");

			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(dao.showAllProducts());
				break;
			case 2:
				System.out.println("Enter the product name to search");
				String productname = sc.next();
				ProductBean bean1 = new ProductBean();
				bean1.setProductname(productname);
				List<ProductBean> list = dao.searchProduct(productname);
				for(ProductBean productBean : list) {
					if(list != null) {
						System.out.println("Product Id is:"+productBean.getProductid());
						System.out.println("Product Name is:"+productBean.getProductname());
						System.out.println("Product Cost is:"+productBean.getProductcost());
						System.out.println("Product Category is:"+productBean.getProductcategory());
						System.out.println("Product Description is:"+productBean.getDescription());
						System.out.println("Number of Products are:"+productBean.getNumberofproducts());
					} else {
						System.out.println("product name not found");
					}
					Operations.Home();
					break;

				}
			default:
				break;

			}
		}
	}

}
