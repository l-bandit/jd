package com.neuedu.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.service.ShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService ShoppingcartService;
	
	//在购物车表上传一条数据，传入用户uid、商品cid、型号sizeid、颜色colorid、购买数量count、当前系统时间
	@RequestMapping("insertShoppingCart/{uid}/{cid}/{sizeid}/{colorid}/{count}")
	@ResponseBody
	public String insertShoppingcart(@PathVariable int uid,@PathVariable int cid,@PathVariable int sizeid,@PathVariable int colorid,@PathVariable int count) {
		ShoppingcartService.insertShoppingCart(uid,cid,sizeid,colorid,count);
		return "{\"result\":\"加入购物车成功\"}";
	}
	
}
