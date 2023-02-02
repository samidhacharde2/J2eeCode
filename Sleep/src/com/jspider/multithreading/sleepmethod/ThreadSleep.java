package com.jspider.multithreading.sleepmethod;

public class ThreadSleep {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		String str="Welcome to WEJM4";
		
		char[] charArray=str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
