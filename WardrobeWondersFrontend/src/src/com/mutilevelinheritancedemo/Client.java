package com.mutilevelinheritancedemo;

import com.interfacedemo.IPrintable;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HrManager hm1=new HrManager(1, "King", 67000, 10000, 5000);
		System.out.println(hm1);
		hm1.testfun();
		
		//hm1.print();
		
		IPrintable ip1=hm1;
		ip1.print();
	}

}
