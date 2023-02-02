package com.jspider.springcorexml.bean;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data 
//@AllArgsConstructor
//@NoArgsConstructor
public class StudentBean {
	
	int id;
	String name;
	String email;
	
	
	
	public StudentBean() {
		super();
	}

	public StudentBean(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
