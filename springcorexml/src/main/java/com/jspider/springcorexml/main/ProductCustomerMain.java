package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.bean.ProductBean;

public class ProductCustomerMain {

	public static void main(String[] args) {

     ApplicationContext context=new ClassPathXmlApplicationContext("ProductCustomerCofig.xml");		
		ProductBean product1=(ProductBean)context.getBean("product1");
		ProductBean product2=(ProductBean)context.getBean("product2");
		ProductBean product3=(ProductBean)context.getBean("product3");

		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
