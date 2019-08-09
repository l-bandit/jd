package com.neuedu.jd.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.jd.model.bean.Collections;
import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.bean.Record;
import com.neuedu.jd.model.bean.User;
import com.neuedu.jd.model.mapper.CollectionsMapper;
import com.neuedu.jd.model.mapper.EvaluationMapper;
import com.neuedu.jd.model.mapper.OrdersMapper;
import com.neuedu.jd.model.mapper.RecordMapper;
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
	
	//初始化：根据获取的用户uid，查询用户表地址
	public User selectUserByUid(int id) {
		return userMapper.selectUserByUid(id);
	}
	
	@Transactional
    //更改用户信息
	public void changeUserById(int id,User user) {
    	Map<String,Object> map=new HashMap<>();
    	map.put("k_id", id);
    	map.put("k_name", user.getName());
    	map.put("k_password", user.getPassword());
    	map.put("k_address", user.getAddress());
    	map.put("k_phone", user.getPhone());
    	System.out.println(user.getUsername());
        userMapper.changeUserById(map); 			
	}
	
	@Transactional
	// 查询用户信息
	public User selectUserById(int uid) {
		return userMapper.selectUserById(uid);
	}

	@Transactional
	// 查询用户订单
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
