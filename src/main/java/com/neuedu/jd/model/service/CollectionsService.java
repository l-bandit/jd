package com.neuedu.jd.model.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Collections;
import com.neuedu.jd.model.mapper.CollectionsMapper;

@Service
public class CollectionsService {

	@Autowired
	private CollectionsMapper collectionsMapper;
	
	//点击收藏按钮后，在商品收藏表上传一条数据，传入用户uid、商品cid、当前系统时间
	public void insertCollections(int uid,int cid){
		Collections collections = new Collections();
		collections.setUid(uid);
		collections.setCid(cid);
		collections.setTime(new Timestamp(new Date().getTime()));
		collectionsMapper.insertCollections(collections);
	}
	
}
