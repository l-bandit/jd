package com.neuedu.jd.model.bean;



/**二级商品分类表*/
public class SecondaryClassification {

	//主键
	private int id;
	//一级分类Id  外键
	private int fid;
	//二级分类名称
	private String secondaryname;
	//图片信息
	private String imgurl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getSecondaryname() {
		return secondaryname;
	}
	public void setSecondaryname(String secondaryname) {
		this.secondaryname = secondaryname;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
}
