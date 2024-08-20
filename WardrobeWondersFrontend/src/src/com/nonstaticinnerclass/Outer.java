package com.nonstaticinnerclass;

public class Outer {

	private int outerField = 30;
	
	class Inner {
		void display() {
			// Can access private members of outer class
			System.out.println(outerField);
		}
	}
	public void createInner() {
		Inner inner = new Inner();
		inner.display();
	}
	
}
