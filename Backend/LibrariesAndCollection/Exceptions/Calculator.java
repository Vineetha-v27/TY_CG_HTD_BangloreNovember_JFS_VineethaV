package com.capgemini.exception.exceptions;

public class Calculator {
	void divide(int a, int b) {
		System.out.println("divide method is called");
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae){
			System.out.println("dont divide by zero");
			
		}
		System.out.println("divided");
		
	}

}
