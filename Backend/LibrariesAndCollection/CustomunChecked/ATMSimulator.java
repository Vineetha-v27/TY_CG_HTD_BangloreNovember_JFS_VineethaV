package com.capgemini.exception.customunchecked;

public class ATMSimulator {
	void withdraw(double amount) {
		if(amount>40000) {
			throw new DayLimitException("daily limit exceeds");
		}
	}

}
