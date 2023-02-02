package com.jspider.adapterpattern.adapter;

import com.jspider.adapterpattern.nterface.Mock;
import com.jspider.adapterpattern.object.Wejm4;

public class Adapter extends Wejm4 implements Mock{
	
	private static Adapter adapter=new Adapter();

	public static void main(String[] args) {
		adapter.rating();
		
	}

	@Override
	public void rating() {
		adapter.setId(1);
		adapter.setName("Gandu");
		adapter.setTech_rating("1");
		adapter.setComm_rating("*");
		
		System.out.println(adapter.getName()+" has teachical rating as: "
		                   +adapter.getTech_rating()+" and Communicaton Rating as: "
				            +adapter.getComm_rating());
      
	}

}
