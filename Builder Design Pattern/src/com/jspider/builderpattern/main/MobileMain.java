package com.jspider.builderpattern.main;

import com.jspider.builderpattern.builder.MobileBuilder;
import com.jspider.builderpattern.object.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		
		Mobile mobile=new MobileBuilder().brand("Samsung").price(100000).model("S24").getMobile();
        System.out.println(mobile);
	}

}
