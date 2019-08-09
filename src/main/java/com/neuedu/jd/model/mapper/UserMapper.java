package com.neuedu.jd.model.mapper;

import com.neuedu.jd.model.bean.User;

public interface UserMapper {

	//初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id);
	
}
