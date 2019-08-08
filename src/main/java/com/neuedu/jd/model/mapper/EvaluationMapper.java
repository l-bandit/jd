package com.neuedu.jd.model.mapper;

import java.util.List;

import com.neuedu.jd.model.bean.Evaluation;

public interface EvaluationMapper {

	//初始化：根据传入的三级商品cid，查询评价表用户uid、内容、时间（年月日），多表查询带回用户表数据
	public List<Evaluation> selectEvaluationByCid(int cid);
	
}
