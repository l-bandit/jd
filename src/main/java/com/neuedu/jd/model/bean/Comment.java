package com.neuedu.jd.model.bean;

import java.sql.Timestamp;

/**社区评论表*/
public class Comment {
	
	//主键
	private int id;
	//社区表id  外键
	private int communityid;
	//评论内容
	private String commentcontent;
	//评论时间
	private Timestamp commenttime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCommunityid() {
		return communityid;
	}
	public void setCommunityid(int communityid) {
		this.communityid = communityid;
	}
	public String getCommentcontent() {
		return commentcontent;
	}
	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}
	public Timestamp getCommenttime() {
		return commenttime;
	}
	public void setCommenttime(Timestamp commenttime) {
		this.commenttime = commenttime;
	}
	
}
