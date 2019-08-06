package com.neuedu.jd.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Commodity;
import com.neuedu.jd.model.mapper.CommodityMapper;

@Service
public class CommodityService {

	@Autowired
	private CommodityMapper commodityMapper;
	
	//首页面分页查询
	public List<Commodity> selectCommoditySales(int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return commodityMapper.selectCommoditySales(map);
	}
	
	//初始化：根据二级商品id查询三级商品返回list（综合排序，id排序）
	public List<Commodity> selectCommodityBySid(int sid) {
		return commodityMapper.selectCommodityBySid(sid);
	}
	
	//根据二级商品id查询三级商品返回list（销量排序，salesvolume排序）
	public List<Commodity> selectCommodityBySidAndSales(int sid) {
		return commodityMapper.selectCommodityBySidAndSales(sid);
	}
	
	//根据二级商品id查询三级商品返回list（价格排序，price排序）	
	public List<Commodity> selectCommodityBySidAndPrice(int sid) {
		return commodityMapper.selectCommodityBySidAndPrice(sid);
	}
	
	//上方查询功能，根据商品名称模糊查询
	public List<Commodity> selectCommodityByName(String name) {
		return commodityMapper.selectCommodityByName("%"+name+"%");
	}

}
