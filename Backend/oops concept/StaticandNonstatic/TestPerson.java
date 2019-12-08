package com.capgemini.staticandnonstatic.staticandnonstatic1;

public class TestPerson {
	public static void main(String arr[]) {
		Person p1 = new Person();
		Person.age = 23;
		p1.name = "John";
		p1.personDetails();
		
	}

}
