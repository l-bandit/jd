package com.neuedu.jd.model.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.bean.User;

public interface UserMapper {
	
	// 登录功能，并返回该用户的信息
	public User login(User user);

	// 注册校验
	public List<User> check(User user);

	// 注册功能
	public void register(User user);

	// 初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id);

	public void changeUserById(Map<String, Object> map);

	public User selectUserById(int uid);

	public Orders selectOrder(int uid);

}
