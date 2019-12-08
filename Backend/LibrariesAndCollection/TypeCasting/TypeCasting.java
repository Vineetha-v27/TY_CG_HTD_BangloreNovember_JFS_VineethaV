package com.tyss.TypeCasting.pack1;

public class TypeCasting {
	byte b = 4;
	short s = b;
	int c = b;
	
	float f = b;
	
	double d = b;
	
	void values() {
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("int value is "+c);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);
	}
	//explicit typecasting
	char n = 'v';
	double d1 = (double) n;
	double pi = 3.142;
	int i = (int) pi;
	void details() {
		System.out.println("int value is"+i);
		System.out.println("double  value is"+pi);
		System.out.println("char value is"+n);
		System.out.println("double  value is"+d1);
	}

}
