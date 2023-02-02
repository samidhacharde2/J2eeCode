package com.jspider.factorypattern.item;

import com.jspider.factorypattern.order.Order;

public class Momos implements Order {

	@Override
	public void orderItem() {
	
		System.out.println("Ordering Momos ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Momos Ready");
		System.out.println("");
	}
}
