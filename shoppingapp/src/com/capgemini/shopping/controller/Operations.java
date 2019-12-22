package com.capgemini.shopping.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.shopping.bean.ProductBean;
import com.capgemini.shopping.daomanager.ProductDAOManager;
import com.capgemini.shoppingapp.dao.ProductDAO;

public class Operations {
	public static void Home() {
		Scanner sc = new Scanner(System.in);
		ProductDAO dao = ProductDAOManager.getProductDAO();
		System.out.println("Enter The Choice to perform below operations");
		System.out.println("Press 1 to buy the products");
		System.out.println("Press 2 to search the product name");
		System.out.println("Press 3 to go back to main menu");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the product id");
			int productid = sc.nextInt();
			System.out.println("Enter the card number");
			String cardnumber = sc.next();
			System.out.println("Enter the cvv");
			int cvv = sc.nextInt();
			
			ProductBean bean1 = new ProductBean();
			bean1.setProductid(productid);
			bean1.setCardnumber(cardnumber);
			bean1.setCvv(cvv);
			
			boolean check1 = dao.buyProduct(productid, cardnumber, cvv);
			if(check1) {
				System.out.println("Accepted the details");
			}else {
				System.out.println("Could not accept the details");
			}
			break;
		case 2:
			System.out.println("Enter the product name to search");
			String productname = sc.next();
			ProductBean bean2 = new ProductBean();
			bean2.setProductname(productname);
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
				break;
			}
			
		default:
			break;
			
			
			
		}	
	}
}
