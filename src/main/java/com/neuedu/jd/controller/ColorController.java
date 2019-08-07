package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Color;
import com.neuedu.jd.model.service.ColorService;

@Controller
public class ColorController {
	
	@Autowired
	private ColorService colorService;
	
	@RequestMapping("selectColorByCid/{cid}")
	@ResponseBody
	public List<Color> selectColorByCid(@PathVariable int cid) {
		return colorService.selectColorByCid(cid);
	}
	
}
