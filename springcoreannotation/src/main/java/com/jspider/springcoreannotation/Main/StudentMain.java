package com.jspider.springcoreannotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.Config.StudentCofig;
import com.jspider.springcoreannotation.bean.StudentBean;

public class StudentMain {

	public static void main(String[] args) {

		
	ApplicationContext context=new AnnotationConfigApplicationContext(StudentCofig.class);
	
//	StudentBean student=context.getBean(StudentBean.class);
//	System.out.println(student);
	
	StudentBean student1=(StudentBean) context.getBean("student1");
	System.out.println(student1);
	
	StudentBean student2=(StudentBean) context.getBean("student2");
	System.out.println(student2);
	
	((AnnotationConfigApplicationContext)context).close();
	}

}
