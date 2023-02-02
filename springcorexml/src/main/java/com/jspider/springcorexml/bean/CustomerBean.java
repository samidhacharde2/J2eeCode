//ManyToMany

package com.jspider.springcorexml.bean;

//import java.util.List;

import lombok.Data;

@Data
public class CustomerBean {

	private int id;
	private String name;
	private String email;
	private long contact;
	
//	private List<ProductBean> product;
}
