package com.jspider.multithreadingwaitandnotify.thread;

import com.jspider.multithreadings.resource.shop.Shop;

public class Customer extends Thread {
private Shop shop;
private int noOfProduct;

public Customer(Shop shop,int noOfProduct) {
	super();
	this.shop=shop;
	this.noOfProduct=noOfProduct;
	
}
	
	public Customer(com.jspider.multithreadingwaitandnotify.thread.Shop shop2, int noOfProduct2) {
	
}

	@Override
		public void run() {
		shop.purchaseProduct(noOfProduct);
		}
}
