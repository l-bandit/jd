package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Orders;

public interface OrdersMapper {

	public List<Orders> selectOrders(Map<String,Object> map);
}
