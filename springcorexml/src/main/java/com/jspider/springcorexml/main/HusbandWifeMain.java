package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.bean.HusbandBean;

public class HusbandWifeMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("HusbandWifeConfig.xml");
		HusbandBean husband=(HusbandBean) context.getBean("husband");
		System.out.println(husband);
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
