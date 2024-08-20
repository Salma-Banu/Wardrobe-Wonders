package com.localclassdemo;

public class Outer {

	private int somedata=90;
    void outerMethod(int num) {
        int x = 100;
        class Local {
            void display() {
                System.out.println(x);
                System.out.println(num);
                System.out.println(somedata);
            }
        }
        Local local = new Local();
        local.display();
    }

}
