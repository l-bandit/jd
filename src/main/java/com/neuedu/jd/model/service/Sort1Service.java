package com.neuedu.jd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.PrimaryClassification;
import com.neuedu.jd.model.mapper.Sort1Mapper;

@Service
public class Sort1Service {

	@Autowired
	private Sort1Mapper sort1Mapper;

	public List<PrimaryClassification> selectPrimaryclassification() {
		return sort1Mapper.selectPrimaryclassification();
	}

}
