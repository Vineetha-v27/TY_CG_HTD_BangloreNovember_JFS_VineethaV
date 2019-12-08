package com.capgemini.constructor.constructormain;

public class TestStudent {
	public static void main(String arr[]) {
		Student s = new Student();
		
		Student s2 = new Student("vini",22);
		System.out.println("studname is "+s2.studName);
		System.out.println("studAge is "+s2.studAge);
		
		
	}

}
