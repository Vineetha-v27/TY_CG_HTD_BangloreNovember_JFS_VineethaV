package com.capgemini.retailerspringboot.dto;

import java.util.List;

public class UserInfoResponce {
	private int statusCode;
	private String message;
	private String description;
	private List<UserInfo> user;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UserInfo> getProduct() {
		return user;
	}
	public void setProduct(List<UserInfo> product) {
		this.user = product;
	}
	

}
