package com.jspider.springcoreannotation.Config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcoreannotation.bean.StudentBean;

public class StudentCofig {

	@Bean
	public StudentBean getStudent() {
		
		StudentBean student = new StudentBean();
		student.setId(1);
		student.setName("Sami");
		student.setEmail("sami@gmail.com");
		student.setCity("Nagpur");
		return student;
	}
	
	@Bean("student1")
	public StudentBean getStudent1() {
		
		return new StudentBean(2,"Aish","aishi@gmail.com","mumbai");
	}
	
	@Bean("student2")
	public StudentBean getStudent2() {
		
		return new StudentBean();
	}
	
}
