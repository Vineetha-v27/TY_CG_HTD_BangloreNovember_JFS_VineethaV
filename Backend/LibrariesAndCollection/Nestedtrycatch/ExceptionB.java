package com.capgemini.exception.nestedtrycatch;

public class ExceptionB {
	void exception(int a, String b) {
		try {
			System.out.println(10/0);
			try {
				System.out.println(500/a);
				}
			catch(ArithmeticException e) {
				System.out.println("dont deal with 0");
			}
	}

		catch(ArithmeticException e) {
			System.out.println("dont deal with 0");
		}
	}

}
