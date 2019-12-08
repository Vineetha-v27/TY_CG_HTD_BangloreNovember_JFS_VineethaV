package com.capgemini.exception.exceptioncatch;

public class TestA {
	public static void main(String[] args) {
		ExceptionA a1 = new ExceptionA();
		System.out.println("main started");
		a1.exception(2, null);
		a1.exception(0, "vinu");
		System.out.println("main ended");
	}

}
