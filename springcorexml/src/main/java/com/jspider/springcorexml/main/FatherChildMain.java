package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.bean.FatherBean;

public class FatherChildMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("FatherChildConfig.xml");
		FatherBean father1=(FatherBean) context.getBean("father1");
		System.out.println(father1);
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
