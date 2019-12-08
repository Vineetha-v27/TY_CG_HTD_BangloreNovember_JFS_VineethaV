package com.capgemini.checkedexception.exceptionpropogation;

public class B {
	static void m() throws ClassNotFoundException  {
		C.n();
	}

}
