package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.SecondaryClassification;
import com.neuedu.jd.model.service.Sort2Service;

@Controller
public class Sort2Controller {

	@Autowired
	private Sort2Service sort2Service;

	@RequestMapping("selectSecondaryClassification/{sort1id}")
	@ResponseBody
	public List<SecondaryClassification> selectSecondaryClassification(@PathVariable int sort1id) {
		List<SecondaryClassification> list = sort2Service.selectSecondaryClassification(sort1id);
		return list;
	}

}
