package com.capgemini.staticandnonstatic.staticandnonstatic1;

public class TestQspiders {
	public static void main(String arr[]) {
		Qspiders rajajinagar = new Qspiders();
		rajajinagar.swipe();
		rajajinagar.swipe();
		Qspiders BTM = new Qspiders();
		BTM.swipe();
		System.out.println(rajajinagar.branchStudCount);
		System.out.println(BTM.branchStudCount);
		System.out.println(Qspiders.totalCount);
	}

}

