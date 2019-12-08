package com.capgemini.exception.customunchecked;

public class SBIAtm {
	public static void main(String[] args) {
		ATMSimulator a1 = new ATMSimulator();
		System.out.println("main started");
		try {
			a1.withdraw(41000);
		}
		catch(DayLimitException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main ended");
	}

}
