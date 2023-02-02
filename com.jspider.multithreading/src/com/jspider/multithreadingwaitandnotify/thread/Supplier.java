package com.jspider.multithreadingwaitandnotify.thread;

import com.jspider.multithreadings.resource.shop.Shop;

public class Supplier extends Thread {
 private com.jspider.multithreadingwaitandnotify.thread.Shop shop;
 private int noOfProduct;
 
 public Supplier(com.jspider.multithreadingwaitandnotify.thread.Shop shop2,int noOfProduct) {
	 this.shop=shop2;
	 this.noOfProduct=noOfProduct;
 }

@Override
	public void run() {
	 shop.restockProduct(noOfProduct);
	}
}
