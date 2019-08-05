package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Commodity;
import com.neuedu.jd.model.service.CommodityService;

@Controller
public class CommodityController {

	@Autowired
	private CommodityService commodityService;

	@RequestMapping("selectSales/{pagenum}/{pagesize}")
	@ResponseBody
	public List<Commodity> selectCommoditySales(@PathVariable int pagenum,@PathVariable int pagesize) {
		List<Commodity> list = commodityService.selectCommoditySales(pagenum,pagesize);
		return list;
	}

}
