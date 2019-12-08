package com.capgemini.exception.throwkey;

public class Ola {
	GoogleMap g1;
	Ola(GoogleMap g1){
		super();
		this.g1=g1;
	}
	void find(String a) {
		try {
			g1.findLocation(a);
			
		}catch(NullPointerException e) {
			System.out.println("ola use please fill the location name");
		}
	}

}
