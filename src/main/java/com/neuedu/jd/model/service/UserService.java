package com.neuedu.jd.model.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.jd.model.bean.Collections;
import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.bean.Record;
import com.neuedu.jd.model.bean.Shop;
import com.neuedu.jd.model.bean.User;
import com.neuedu.jd.model.mapper.CollectionsMapper;
import com.neuedu.jd.model.mapper.EvaluationMapper;
import com.neuedu.jd.model.mapper.OrdersMapper;
import com.neuedu.jd.model.mapper.RecordMapper;
import com.neuedu.jd.model.mapper.ShopMapper;
import com.neuedu.jd.model.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrdersMapper ordermapper;
	@Autowired
	private EvaluationMapper evaluationmapper;
	@Autowired
	private RecordMapper recordmapper;
	@Autowired
	private CollectionsMapper collectionsmapper;
	@Autowired
	private ShopMapper shopMapper;

	// 登录功能，并返回该用户的信息
	public User login(User user) {
		return userMapper.login(user);
	}

	// 注册校验
	public String check(User user) {
		if (userMapper.check(user).size() > 0) {
			return "重复";
		} else {
			return "正确";
		}
	};

	// 注册
	@Transactional
	public void register(User user, Shop shop) {
		user.setTime(new Timestamp(new Date().getTime()));
		userMapper.register(user);
		String category = user.getCategory();
		if ("商家".equals(category)) {
			int uid = user.getId();
			System.out.println("uid=" + uid);
			shop.setUid(uid);
			shopMapper.registerShop(shop);
		}
	}

	// 初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id) {
		return userMapper.selectUserByUid(id);
	}
	
	// 更改用户信息
	@Transactional	
	public void changeUserById(int id, User user) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_id", id);
		map.put("k_name", user.getName());
		map.put("k_password", user.getPassword());
		map.put("k_address", user.getAddress());
		map.put("k_phone", user.getPhone());
		userMapper.changeUserById(map);
	}
	
	// 查询用户信息
	@Transactional	
	public User selectUserById(int uid) {
		return userMapper.selectUserById(uid);
	}
	
	// 查询用户订单
	@Transactional	
	public List<Orders> selectOrders(int uid, int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_uid", uid);
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return ordermapper.selectOrders(map);
	}

	// 查询未评价订单
	public List<Orders> selectEvaluation(int uid, int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_uid", uid);
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return evaluationmapper.selectEvaluation(map);
	}

	// 查询浏览足迹
	public List<Record> selectRecord(int uid, int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_uid", uid);
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return recordmapper.selectRecord(map);
	}

	// 查询收藏商品
	public List<Collections> selectCollections(int uid, int pagenum, int pagesize) {
		Map<String, Object> map = new HashMap<>();
		map.put("k_uid", uid);
		map.put("k_beginIndex", (pagenum - 1) * pagesize);
		map.put("k_pagesize", pagesize);
		return collectionsmapper.selectCollections(map);
	}

	// 查询收藏总数
	// public String selectCollectionsCount(int uid) {
	// return collectionsmapper.selectCollectionsCount(uid);
	// }

}
