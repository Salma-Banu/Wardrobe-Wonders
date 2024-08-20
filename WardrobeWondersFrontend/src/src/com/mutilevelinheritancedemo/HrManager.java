package com.mutilevelinheritancedemo;
import com.interfacedemo.IPrintable;

public class HrManager extends Manager implements IPrintable{
	
	private double da;
	
	public HrManager(int empid,String name,double salary,
			double incentives,double da)
	{
		super(empid,name,salary,incentives);
		System.out.println("HrManager class ctor");
		this.da=da;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" DA-"+this.da;
	}
	
	public void testfun()
	{
		super.test();
	}

	public void print()
	{
		System.out.println("Print in HrManager class");
	}
	
}
