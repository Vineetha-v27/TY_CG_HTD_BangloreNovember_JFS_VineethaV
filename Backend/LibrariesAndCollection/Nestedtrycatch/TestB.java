package com.capgemini.exception.nestedtrycatch;

public class TestB {
	public static void main(String[] args) {
		ExceptionB e1 = new ExceptionB();
		System.out.println("main started");
		
		e1.exception(2, null);
		
		System.out.println("main ended");
	}

}
