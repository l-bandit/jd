package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.PrimaryClassification;
import com.neuedu.jd.model.service.Sort1Service;

@Controller
public class Sort1Controller {

	@Autowired
	private Sort1Service sort1Service;

	@RequestMapping("selectPrimaryclassification1")
	@ResponseBody
	public List<PrimaryClassification> selectPrimaryclassification() {
		List<PrimaryClassification> list = sort1Service.selectPrimaryclassification();
		return list;
	}

}
