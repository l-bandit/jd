package com.neuedu.jd.model.mapper;

import com.neuedu.jd.model.bean.Record;

public interface RecordMapper {

	//初始化商品信息页面后，在浏览记录表上传一条数据，传入用户uid、商品cid、当前系统时间
	public void insertRecord(Record record);
	
}
