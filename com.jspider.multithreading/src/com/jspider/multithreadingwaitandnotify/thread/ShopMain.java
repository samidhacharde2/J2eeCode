package com.jspider.multithreadingwaitandnotify.thread;

public class ShopMain {

	public static void main(String[] args) {
		Shop shop=new Shop(100);
        
		Customer custome=new Customer(shop,50);
		Customer customer2= new Customer(shop, 70);

		Supplier supplir=new Supplier(shop,100);
		
		custome.start();
		customer2.start();
		supplir.start();
	}

}
