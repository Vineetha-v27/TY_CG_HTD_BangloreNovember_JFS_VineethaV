package com.capgemini.exception.exceptionpropagation;

public class A {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			B.m();
		}catch(ClassNotFoundException e) {
			System.out.println("exception handled");
		}
		System.out.println("main ended");
	}

}
