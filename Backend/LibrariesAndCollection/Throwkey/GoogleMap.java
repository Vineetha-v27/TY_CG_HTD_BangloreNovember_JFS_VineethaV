package com.capgemini.exception.throwkey;

public class GoogleMap {
	void findLocation(String loc) {
		try {
			System.out.println(loc.length());
		}catch(NullPointerException n) {
			System.out.println("Please fill location name");
			throw n;
		}
	}

}
