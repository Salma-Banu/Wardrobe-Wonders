package com.staticinnerclass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.display();
	}

}
