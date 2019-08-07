package com.neuedu.jd.model.mapper;

import com.neuedu.jd.model.bean.User;

public interface UserMapper {

	public User selectUserByUid(int id);
	
}
