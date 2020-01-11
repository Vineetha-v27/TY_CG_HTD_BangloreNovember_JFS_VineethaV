package com.capgemini.retailerspringboot.exceptions;

public class UserInfoExceptions extends RuntimeException{
	String msg;

	public UserInfoExceptions(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
