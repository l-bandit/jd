package com.neuedu.jd.model.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.ShoppingCart;
import com.neuedu.jd.model.mapper.ShoppingCartMapper;

@Service
public class ShoppingCartService {

	@Autowired
	private ShoppingCartMapper shoppingcartMapper;
	
	//在购物车表上传一条数据，传入用户uid、商品cid、型号sizeid、颜色colorid、购买数量count、当前系统时间
	public void insertShoppingCart(int uid,int cid,int sizeid,int colorid,int count) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setUid(uid);
		shoppingCart.setCid(cid);
		shoppingCart.setSizeid(sizeid);
		shoppingCart.setColorid(colorid);
		shoppingCart.setCount(count);
		shoppingCart.setTime(new Timestamp(new Date().getTime()));
		shoppingcartMapper.insertShoppingCart(shoppingCart);
	}
	
}
