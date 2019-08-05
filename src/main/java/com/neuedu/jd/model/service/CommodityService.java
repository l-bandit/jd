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

	public List<Commodity> selectCommoditySales(int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return commodityMapper.selectCommoditySales(map);
	}

}
