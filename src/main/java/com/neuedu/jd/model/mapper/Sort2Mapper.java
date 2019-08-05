package com.neuedu.jd.model.mapper;

import java.util.List;

import com.neuedu.jd.model.bean.SecondaryClassification;

public interface Sort2Mapper {

	// 查询二级分类
	public List<SecondaryClassification> selectSecondaryClassification(int sort1id);

}
