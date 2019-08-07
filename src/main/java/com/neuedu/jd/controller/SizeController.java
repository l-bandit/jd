package com.neuedu.jd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.jd.model.bean.Size;
import com.neuedu.jd.model.service.SizeService;

@Controller
public class SizeController {
	
	@Autowired
	private SizeService sizeService;
	
	@RequestMapping("selectSizeByCid/{cid}")
	@ResponseBody
	public List<Size> selectSizeByCid(@PathVariable int cid) {
		return sizeService.selectSizeByCid(cid);
	}

}
