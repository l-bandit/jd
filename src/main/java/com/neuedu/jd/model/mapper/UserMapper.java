package com.neuedu.jd.model.mapper;

import java.util.Map;

import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.bean.User;

public interface UserMapper {

	//初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id);
	
	public void changeUserById(Map<String,Object> map);

	public User selectUserById(int uid);

	public Orders selectOrder(int uid);
	
}
