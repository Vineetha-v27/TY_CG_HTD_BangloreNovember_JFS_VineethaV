package com.capgemini.retailerspringboot.exceptions;

public class OrderInfoExceptions extends RuntimeException {
	String msg;

	public OrderInfoExceptions(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}


}
