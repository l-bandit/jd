package com.neuedu.jd.model.bean;

import java.util.List;

/**商品表*/
public class Commodity {
	
	//主键
	private int id;
	//商品名称
	private String name;
	//价格
	private double price;
	//商品描述
	private String description;
	//封面图片
	private String imgurl;
	//商品详情图片
	private String imgsrc;
	//评论数
	private int commentcount;
	//销量
	private int salesvolume;
	//店铺id  外键
	private int shopid;
	//二级分类    外键
	private int sid;
	//获取店铺表信息时用的属性
	private List<Shop> shop;
	

	public List<Shop> getShop() {
		return shop;
	}
	public void setShop(List<Shop> shop) {
		this.shop = shop;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public int getCommentcount() {
		return commentcount;
	}
	public void setCommentcount(int commentcount) {
		this.commentcount = commentcount;
	}
	public int getSalesvolume() {
		return salesvolume;
	}
	public void setSalesvolume(int salesvolume) {
		this.salesvolume = salesvolume;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
