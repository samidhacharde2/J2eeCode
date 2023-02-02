package com.jspider.SingletonLazy_dp;

import java.util.EventObject;
import java.util.Objects;

public class SingletonLazy {

	static SingletonLazy object;
	static int count;
	
	private SingletonLazy() {
		count++;	
	}
	public static SingletonLazy getObject() {
		
		if(object==null) {
			object = new SingletonLazy();
		}
		System.out.println("Object Created "+count+" times");
		return object;
	}
}
