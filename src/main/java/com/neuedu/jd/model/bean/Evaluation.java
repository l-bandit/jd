package com.neuedu.jd.model.bean;

import java.sql.Timestamp;

/**商品评价表*/
public class Evaluation {
	
	//主键
	private int id;
	//商品id  外键
	private int cid;
	//用户id  外键
	private int uid;
	//评价内容
	private String content;
	//评价时间
	private Timestamp time;
	//获取用户表信息时用的属性
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
