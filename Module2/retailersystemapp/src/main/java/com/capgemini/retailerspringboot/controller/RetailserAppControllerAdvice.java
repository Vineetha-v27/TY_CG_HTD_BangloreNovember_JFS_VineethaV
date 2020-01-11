package com.capgemini.retailerspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailerspringboot.dto.OrderInfoResponce;
import com.capgemini.retailerspringboot.dto.ProductInfoResponce;
import com.capgemini.retailerspringboot.dto.UserInfoResponce;
import com.capgemini.retailerspringboot.exceptions.OrderInfoExceptions;
import com.capgemini.retailerspringboot.exceptions.ProductInfoExceptions;
import com.capgemini.retailerspringboot.exceptions.UserInfoExceptions;

@RestControllerAdvice
public class RetailserAppControllerAdvice {
	@ExceptionHandler(UserInfoExceptions.class)
	public UserInfoResponce handleUserInfoExceptions(UserInfoExceptions e) {
		UserInfoResponce responce = new UserInfoResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription(e.getMessage());
		return responce;
	}
	
	@ExceptionHandler(ProductInfoExceptions.class)
	public ProductInfoResponce handleProductInfoExceptions(ProductInfoExceptions e) {
		ProductInfoResponce responce = new ProductInfoResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription(e.getMessage());
		return responce;
	}
	
	@ExceptionHandler(OrderInfoExceptions.class)
	public OrderInfoResponce handleOrderInfoExceptions(OrderInfoExceptions e) {
		OrderInfoResponce responce = new OrderInfoResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription(e.getMessage());
		return responce;
	}
	

}
