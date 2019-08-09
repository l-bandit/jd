package com.neuedu.jd.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.User;
import com.neuedu.jd.model.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	//初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id) {
		return userMapper.selectUserByUid(id);
	}
	
}
