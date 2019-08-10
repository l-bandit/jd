package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Orders;

public interface OrdersMapper {
	
	//在订单表上传一条数据，传入用户uid、商品cid、购买数量count、是否已评价、当前系统时间
	public void insertOrders(Orders orders);

	public List<Orders> selectOrders(Map<String,Object> map);
	
}
