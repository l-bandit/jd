package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Collections;
import com.neuedu.jd.model.service.CollectionsService;
import com.neuedu.jd.model.service.UserService;

@Controller
public class CollectionsController {

	@Autowired
	private CollectionsService collectionsService;
	
	@Autowired
	private UserService userservice;
	
	//点击收藏按钮后，在商品收藏表上传一条数据，传入用户uid、商品cid、当前系统时间
	@RequestMapping("insertCollections/{uid}/{cid}")
	@ResponseBody
	public String insertCollections(@PathVariable int uid,@PathVariable int cid) {
		collectionsService.insertCollections(uid, cid);
		return "{\"result\":\"收藏成功\"}";
	}
	
	//查询商品收藏
    @RequestMapping("selectCollections/{uid}/{pagenum}/{pagesize}")
    @ResponseBody    
 	public List<Collections> selectCollections(@PathVariable int uid,@PathVariable int pagenum,@PathVariable int pagesize){
 	   return userservice.selectCollections(uid,pagenum,pagesize);
 	}
//    //查询收藏总数
//    @RequestMapping("selectCollectionsCount/{uid}")
//    @ResponseBody
//    public String selectCollectionsCount(@PathVariable int uid){
//    	int count=Integer.parseInt(userservice.selectCollectionsCount(uid));
//    	return "{\"result\":\""+count+"\"}";
//    }
}
