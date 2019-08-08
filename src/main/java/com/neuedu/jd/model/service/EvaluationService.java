package com.neuedu.jd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Color;
import com.neuedu.jd.model.bean.Evaluation;
import com.neuedu.jd.model.mapper.ColorMapper;
import com.neuedu.jd.model.mapper.EvaluationMapper;

@Service
public class EvaluationService {

	@Autowired
	private EvaluationMapper evaluationMapper;
	
	//初始化：根据传入的三级商品cid，查询评价表用户uid、内容、时间（年月日），多表查询带回用户表数据
	public List<Evaluation> selectEvaluationByCid(int cid) {
		return evaluationMapper.selectEvaluationByCid(cid);
	}
	
}
