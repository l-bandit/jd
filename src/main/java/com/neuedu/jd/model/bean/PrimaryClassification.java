package com.neuedu.jd.model.bean;


/**一级分类表*/
public class PrimaryClassification {
	
	//主键  
	private int id;
	//以及分类名称
	private String firstname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}
