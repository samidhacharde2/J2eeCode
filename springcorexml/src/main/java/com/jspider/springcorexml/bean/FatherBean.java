//OneToMany

package com.jspider.springcorexml.bean;

import java.util.List;

import lombok.Data;
@Data
public class FatherBean {
	
	int id;
	String name;
	int age;
	List<ChildBean> children;

}
