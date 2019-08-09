package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Evaluation;
import com.neuedu.jd.model.bean.Orders;
import com.neuedu.jd.model.service.EvaluationService;
import com.neuedu.jd.model.service.UserService;

@Controller
public class EvaluationController {

	@Autowired
	private EvaluationService evaluationService;
	
	@Autowired
	public UserService userservice;
	
	//初始化：根据传入的三级商品cid，查询评价表用户uid、内容、时间（年月日），多表查询带回用户表数据
	@RequestMapping("selectEvaluationByCid/{cid}")
	@ResponseBody
	public List<Evaluation> selectEvaluationByCid(@PathVariable int cid) {
		return evaluationService.selectEvaluationByCid(cid);
	}
	
	//查询未评价
	@RequestMapping("selectEvaluation/{uid}/{pagenum}/{pagesize}")
	@ResponseBody
	public List<Orders> selectEvaluation(@PathVariable int uid,@PathVariable int pagenum,@PathVariable int pagesize){
	   return userservice.selectEvaluation(uid,pagenum,pagesize);
	}
	
}
