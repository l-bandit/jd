package com.neuedu.jd.model.mapper;

import com.neuedu.jd.model.bean.ShoppingCart;

public interface ShoppingCartMapper {

	//在购物车表上传一条数据，传入用户uid、商品cid、型号sizeid、颜色colorid、购买数量count、当前系统时间
	public void insertShoppingCart(ShoppingCart shoppingcart);
	
}
