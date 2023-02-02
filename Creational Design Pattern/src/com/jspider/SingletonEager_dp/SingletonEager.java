package com.jspider.SingletonEager_dp;

public class SingletonEager {

	static SingletonEager object;
	static int count;
	
	private SingletonEager() {
		count++;
	}
	public static SingletonEager getObject() {
		
		System.out.println("Object Created "+count+" times");
		return object;
	}
}
