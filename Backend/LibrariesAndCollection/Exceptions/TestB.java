package com.capgemini.exception.exceptions;

public class TestB {
	private String s1;

	void write() {
		s1 = null;
		
		try {
			System.out.println("length of the string is"+s1.length());
		}
		catch(NullPointerException e) {
			System.out.println("dont deal with null");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("main started");
		TestB b1 = new TestB();
		b1.write();
		System.out.println("main ended");
	}
	

}
