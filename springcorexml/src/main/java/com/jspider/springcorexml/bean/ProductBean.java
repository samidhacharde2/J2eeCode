//ManyToMany

package com.jspider.springcorexml.bean;

import java.util.List;

import lombok.Data;

@Data
public class ProductBean {

	private int id;
	private String name;
	private double price;
	private String category;
	
	List<CustomerBean> customer;
}
