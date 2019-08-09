package com.neuedu.jd.model.bean;

import java.sql.Timestamp;
import java.util.List;


/**商品收藏表*/
public class Collections {
	
	//主键id
	private int id;
	//用户id  外键
	private int uid;
	//商品id  外键
	private int cid;
	//关注时间
	private Timestamp time;
	//获取商品信息是需要的属性
	private List<Commodity> commodity;
	
	public List<Commodity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
