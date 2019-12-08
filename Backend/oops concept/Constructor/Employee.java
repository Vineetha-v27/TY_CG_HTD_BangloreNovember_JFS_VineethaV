package com.capgemini.constructor.constructormain;

public class Employee {
	int empage;
	String empname;
	double empsalary;
	
	Employee(int age, String name, double salary){
		empage = age;
		empname = name;
		empsalary = salary;
	}
	void details() {
		System.out.println("empage is "+empage+" and empname is "+empname+" and empsalary is"+empsalary);
	}

}
