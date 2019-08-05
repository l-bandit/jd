package com.neuedu.jd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.SecondaryClassification;
import com.neuedu.jd.model.mapper.Sort2Mapper;

@Service
public class Sort2Service {

	@Autowired
	private Sort2Mapper sort2Mapper;

	public List<SecondaryClassification> selectSecondaryClassification(int sort1id) {
		return sort2Mapper.selectSecondaryClassification(sort1id);
	}

}
