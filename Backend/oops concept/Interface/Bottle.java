package com.capgemini.interface1.interfaceconcept;

public interface Bottle {
	void open();
	void close();
	static void juice() {
		System.out.println("juice is good");
	}
	default void drink() {
			System.out.println("drink the juice");
		}
		
		
	}

