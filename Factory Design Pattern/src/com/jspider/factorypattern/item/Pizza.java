package com.jspider.factorypattern.item;

import com.jspider.factorypattern.order.Order;

public class Pizza implements Order {

	@Override
	public void orderItem() {
		System.out.println("Ordering Pizza");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pizza Ready ");
		System.out.println("");
		
	}
}
