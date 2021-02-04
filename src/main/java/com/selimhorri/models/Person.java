package com.selimhorri.models;

public class Person {
	
	private Integer id;
	private String fname;
	private String lname;
	
	public Person() {
		
	}
	
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Person(Integer id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}









