package com.neuedu.jd.model.bean;



/**商品尺码表*/
public class Size {
	
	//主键
	private int id;
	//商品id  外键
	private int cid;
	//尺码
	private String size;
	
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
