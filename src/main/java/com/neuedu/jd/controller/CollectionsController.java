package com.neuedu.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.service.CollectionsService;

@Controller
public class CollectionsController {

	@Autowired
	private CollectionsService collectionsService;
	
	//点击收藏按钮后，在商品收藏表上传一条数据，传入用户uid、商品cid、当前系统时间
	@RequestMapping("insertCollections/{uid}/{cid}")
	@ResponseBody
	public String insertCollections(@PathVariable int uid,@PathVariable int cid) {
		collectionsService.insertCollections(uid, cid);
		return "{\"result\":\"收藏成功\"}";
	}
}
