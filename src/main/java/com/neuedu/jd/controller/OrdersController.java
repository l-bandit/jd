package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.service.OrdersService;
import com.neuedu.jd.model.service.UserService;

@Controller
public class OrdersController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private OrdersService ordersService;
	
	//在订单表上传一条数据，传入用户uid、商品cid、购买数量count、是否已评价、当前系统时间
	@RequestMapping("insertOrders/{uid}/{cid}/{count}")
	@ResponseBody
	public String insertOrders(@PathVariable int uid,@PathVariable int cid,@PathVariable int count) {
		ordersService.insertOrders(uid,cid,count);
		return "{\"result\":\"加入订单成功\"}";
	}
	
	@RequestMapping("selectOrders/{uid}/{pagenum}/{pagesize}")
	@ResponseBody
	//查询用户订单
	public List<Orders> selectOrders(@PathVariable int uid,@PathVariable int pagenum,@PathVariable int pagesize){
	   return userservice.selectOrders(uid,pagenum,pagesize);
	}
}
