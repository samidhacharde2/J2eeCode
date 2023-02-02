package com.jspider.multithreading.main;

import com.jspider.multithreading.MyThread1;
import com.jspider.multithreading.MyThread2;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		thread.start();
	}

}
