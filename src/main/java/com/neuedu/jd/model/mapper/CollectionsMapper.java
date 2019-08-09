package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Collections;

public interface CollectionsMapper {

	//点击收藏按钮后，在商品收藏表上传一条数据，传入用户uid、商品cid、当前系统时间
	public void insertCollections(Collections collections);
	
	public List<Collections> selectCollections(Map<String, Object> map);

	// public String selectCollectionsCount(int uid);
	
}
