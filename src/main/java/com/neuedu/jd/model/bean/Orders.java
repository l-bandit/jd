package com.neuedu.jd.model.bean;

import java.sql.Timestamp;

/**订单表*/
public class Orders {
	
	//主键
	private int id;
	//用户id  外键
	private int uid;
	//商品id  外键
	private int cid;
	//购买数量
	private int count;
	//总价
	private double price;
	//是否已评价
	private String evaluatekey;
	//购买时间
	private Timestamp time;
	
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEvaluatekey() {
		return evaluatekey;
	}
	public void setEvaluatekey(String evaluatekey) {
		this.evaluatekey = evaluatekey;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
