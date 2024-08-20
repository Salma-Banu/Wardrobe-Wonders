package com.mutilevelinheritancedemo;

public class Employee {
	
	private int empid;
	private String name;
	private double salary;
	
	public Employee(int empid,String name,double salary)
	{
		System.out.println("Employee class ctor");
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empid-"+this.empid+" Name-"+this.name+" Salary-"
				+this.salary;
	}

	
	public void test()
	{
		System.out.println("in Employee class- test()");
	}
}
