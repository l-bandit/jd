package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Evaluation;
import com.neuedu.jd.model.service.EvaluationService;

@Controller
public class EvaluationController {

	@Autowired
	private EvaluationService evaluationService;
	
	//初始化：根据传入的三级商品cid，查询评价表用户uid、内容、时间（年月日），多表查询带回用户表数据
	@RequestMapping("selectEvaluationByCid/{cid}")
	@ResponseBody
	public List<Evaluation> selectEvaluationByCid(@PathVariable int cid) {
		return evaluationService.selectEvaluationByCid(cid);
	}
	
}
