package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Commodity;

public interface CommodityMapper {

	//首页面分页查询
	public List<Commodity> selectCommoditySales(Map<String, Object> map);
	
	//初始化：根据二级商品id查询三级商品返回list（综合排序，id排序）
	public List<Commodity> selectCommodityBySid(int sid);
	
	//根据二级商品id查询三级商品返回list（销量排序，salesvolume排序）
	public List<Commodity> selectCommodityBySidAndSales(int sid);
	
	//根据二级商品id查询三级商品返回list（价格排序，price排序）	
	public List<Commodity> selectCommodityBySidAndPrice(int sid);
	
	//上方查询功能，根据商品名称模糊查询
	public List<Commodity> selectCommodityByName(String name);
	
	//初始化：根据传入的三级商品cid，查询三级商品表信息
	public Commodity selectCommodityByCid(int id);
	
	
	
}
