package com.capgemini.shopping.bean;

import java.io.Serializable;

public class ProductBean implements Serializable{
	private int productid;
	private String productname;
	private double productcost;
	private String productcategory;
	private String description;
	private int numberofproducts;
	private String cardnumber;
	private int cvv;
	
	
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductcost() {
		return productcost;
	}
	public void setProductcost(double productcost) {
		this.productcost = productcost;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberofproducts() {
		return numberofproducts;
	}
	public void setNumberofproducts(int numberofproducts) {
		this.numberofproducts = numberofproducts;
	}
	@Override
	public String toString() {
		return "ProductBean [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
				+ ", productcategory=" + productcategory + ", description=" + description + ", numberofproducts="
				+ numberofproducts + "]";
	}
	

}
