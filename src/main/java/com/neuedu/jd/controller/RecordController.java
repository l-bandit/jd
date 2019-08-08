package com.neuedu.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.service.RecordService;

@Controller
public class RecordController {
	
	@Autowired
	private RecordService recordService;
	
	//初始化商品信息页面后，在浏览记录表上传一条数据，传入用户uid、商品cid、当前系统时间
	@RequestMapping("insertRecord/{uid}/{cid}")
	@ResponseBody
	public String insertRecord(@PathVariable int uid,@PathVariable int cid) {
		recordService.insertRecord(uid, cid);
		return "{\"result\":\"存储记录成功\"}";
	}
	
}
