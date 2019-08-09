package com.neuedu.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Shop;
import com.neuedu.jd.model.bean.User;
import com.neuedu.jd.model.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// 登录功能，并返回该用户的信息
	@RequestMapping("login")
	@ResponseBody
	public User login(User user) {
		return userService.login(user);
	}

	// 校验
	@RequestMapping("check")
	@ResponseBody
	public String check(User user) {
		String flag = userService.check(user);
		return "{\"flag\":\"" + flag + "\"}";
	}

	// 注册
	@RequestMapping("register")
	@ResponseBody
	public String register(User user, Shop shop) {
		userService.register(user, shop);
		return "{\"a\":\"a\"}";
	}

	// 初始化：根据获取的用户uid，查询用户表地址
	@RequestMapping("selectUserByUid/{id}")
	@ResponseBody
	public User selectUserByUid(@PathVariable int id) {
		return userService.selectUserByUid(id);
	}

	// 更改用户信息
	@RequestMapping("changeUserById/{id}")
	@ResponseBody
	public void changeUserById(@PathVariable int id, User user) {
		userService.changeUserById(id, user);
	}

	// 查询用户信息
	@RequestMapping("selectUserById/{uid}")
	@ResponseBody
	public User selectUserById(@PathVariable int uid) {
		System.out.println("到con");
		return userService.selectUserById(uid);
	}

}
