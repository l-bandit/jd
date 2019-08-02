package com.neuedu.jd.model.bean;

import java.sql.Timestamp;
import java.util.List;

/**购物车表*/
public class ShoppingCart {

	//主键
	private int id;
	//用户id  外键
	private int uid;
	//商品id  外键
	private int cid;
	//尺码id  外键
	private int sizeid;
	//颜色表id  外键
	private int colorid;
	//加入购物车时间
	private Timestamp time;
	//获取商品信息时需要的属性
	private List<Commodity> commodity;
	//获取商品尺码时需要的属性
	private List<Size> size;
	//获取商品颜色时需要的属性
	private List<Color> color;
	
	
	
	public List<Commodity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}
	public List<Size> getSize() {
		return size;
	}
	public void setSize(List<Size> size) {
		this.size = size;
	}
	public List<Color> getColor() {
		return color;
	}
	public void setColor(List<Color> color) {
		this.color = color;
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
	public int getSizeid() {
		return sizeid;
	}
	public void setSizeid(int sizeid) {
		this.sizeid = sizeid;
	}
	public int getColorid() {
		return colorid;
	}
	public void setColorid(int colorid) {
		this.colorid = colorid;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
