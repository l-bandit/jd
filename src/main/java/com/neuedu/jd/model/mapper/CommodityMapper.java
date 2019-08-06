package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Commodity;

public interface CommodityMapper {

	// 查询一级分类
	public List<Commodity> selectCommoditySales(Map<String, Object> map);
	
	//查询三级商品列表
	public List<Commodity> selectCommodityBySid(int sid);
	
}
