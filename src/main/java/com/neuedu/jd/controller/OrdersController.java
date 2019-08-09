package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.service.UserService;

@Controller
public class OrdersController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("selectOrders/{uid}/{pagenum}/{pagesize}")
	@ResponseBody
	//查询用户订单
	public List<Orders> selectOrders(@PathVariable int uid,@PathVariable int pagenum,@PathVariable int pagesize){
	   return userservice.selectOrders(uid,pagenum,pagesize);
	}
}
