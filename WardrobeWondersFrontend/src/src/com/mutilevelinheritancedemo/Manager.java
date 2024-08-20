package com.mutilevelinheritancedemo;

public class Manager extends Employee {
	
		private double incentives;
		
		public Manager(int empid,String name,double salary,double incentives)
		{
			super(empid,name,salary);
			System.out.println("Manager class ctor");
			this.incentives=incentives;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" incenetives-"+this.incentives;
		}
		
		@Override
		public void test() {
		// TODO Auto-generated method stub
		    System.out.println("In Manager class- test()");
		}
	

}
