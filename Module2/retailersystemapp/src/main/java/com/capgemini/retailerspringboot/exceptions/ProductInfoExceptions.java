package com.capgemini.retailerspringboot.exceptions;

public class ProductInfoExceptions extends RuntimeException{
	String msg;

	public ProductInfoExceptions(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}


}
