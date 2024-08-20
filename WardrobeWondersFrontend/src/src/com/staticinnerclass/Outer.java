package com.staticinnerclass;

public class Outer {
    
	private static int outerStaticField = 10;
   // private int num=20;
	
    static class StaticNested {
        void display() {
            // Can access static members of outer class
            System.out.println(outerStaticField);
            
         // Cannot access non-static members of outer class
            //System.out.println(num);
        }
    }
}
