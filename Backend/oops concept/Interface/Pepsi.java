package com.capgemini.interface1.interfaceconcept;

 public class Pepsi implements Bottle{
	public void open() {
		System.out.println("open the bottle");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close the bottle");
	}
	public void drink() {
		System.out.println("drinking pepsi juice");
	}
	

}
