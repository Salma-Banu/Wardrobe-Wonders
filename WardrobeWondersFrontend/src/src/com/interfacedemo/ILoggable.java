package com.interfacedemo;

public interface ILoggable {

	void log();
	
    default void monitor() {
        System.out.println("Monitoring the application using xyz insights");
    }
    
    static void getInsights() {
        System.out.println("Getting insights of app performance");
    }

	
}
