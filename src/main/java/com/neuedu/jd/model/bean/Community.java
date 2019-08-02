package com.neuedu.jd.model.bean;

import java.sql.Timestamp;
import java.util.List;

/**社区表*/
public class Community {
	
	//主键id
	private int id;
	//用户id  外键
	private int uid;
	//发布的文字内容
	private String content;
	//发布的图片信息
	private String imgurl;
	//点赞数
	private int like;
	//发布时间
	private Timestamp issuedtime;
	//获取评论信息时需要的属性
	private List<Comment> comment;
	
	
	
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public Timestamp getIssuedtime() {
		return issuedtime;
	}
	public void setIssuedtime(Timestamp issuedtime) {
		this.issuedtime = issuedtime;
	}
	
}
