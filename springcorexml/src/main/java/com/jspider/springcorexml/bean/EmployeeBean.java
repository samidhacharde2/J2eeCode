package com.jspider.springcorexml.bean;

import lombok.Data;

@Data
public class EmployeeBean {

	private int id;
	private String name;
	private double salary;
	private CompanyBean company;
}
