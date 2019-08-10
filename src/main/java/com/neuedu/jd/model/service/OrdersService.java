package com.neuedu.jd.model.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.mapper.OrdersMapper;

@Service
public class OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	
	//在订单表上传一条数据，传入用户uid、商品cid、购买数量count、是否已评价、当前系统时间
	public void insertOrders(int uid,int cid,int count) {
		Orders orders = new Orders();
		orders.setUid(uid);
		orders.setCid(cid);
		orders.setCount(count);
		orders.setEvaluatekey("否");
		orders.setTime(new Timestamp(new Date().getTime()));
		ordersMapper.insertOrders(orders);
	}
	
}
