package com.neuedu.jd.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.User;
import com.neuedu.jd.model.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User selectUserByUid(int id) {
		return userMapper.selectUserByUid(id);
	}
	
}
