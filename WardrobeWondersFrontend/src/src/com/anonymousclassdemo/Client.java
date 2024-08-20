package com.anonymousclassdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractDemo obj = new AbstractDemo() {
            void show() {
                System.out.println("Anonymous Class Example");
            }
        };
        obj.show();
        
        
        AbstractDemo obj1=new AbstractDemo() {
        	void show()
        	{
        		System.out.println("Another anonymous example");
        	}
        };
        
        obj1.show();

	}

}
