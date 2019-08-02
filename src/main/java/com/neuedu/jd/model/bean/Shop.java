package com.neuedu.jd.model.bean;


/**店铺信息表*/
public class Shop {

	//主键
	private int id;
	//用户id  外键
	private int uid;
	//店铺名称
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
