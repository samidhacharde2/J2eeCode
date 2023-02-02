package com.jspider.multithreadings;

import com.jspider.multithreadings.resource.shop.Shop;


public class Customer extends Thread {
	private Shop shop;
	private int noOfProduct;
	
	public Customer(Shop shop,int noOfProduct) {
		super();
		this.shop=shop;
		this.noOfProduct=noOfProduct;
	}
	@Override
	public void run() {
	     shop.purchaseProduct(noOfProduct);
	}

	
}
