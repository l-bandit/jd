package com.neuedu.jd.model.bean;


/**颜色表*/
public class Color {
	
	//主键Id
	private int id;
	//商品id  外键
	private int cid;
	//颜色
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
