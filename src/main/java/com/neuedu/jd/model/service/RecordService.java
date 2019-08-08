package com.neuedu.jd.model.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Record;
import com.neuedu.jd.model.mapper.RecordMapper;

@Service
public class RecordService {
	
	@Autowired
	private RecordMapper recordMapper;
	
	//初始化商品信息页面后，在浏览记录表上传一条数据，传入用户uid、商品cid、当前系统时间
	public void insertRecord(int uid,int cid){
		Record record = new Record();
		record.setUid(uid);
		record.setCid(cid);
		record.setTime(new Timestamp(new Date().getTime()));
		recordMapper.insertRecord(record);
	}

}
