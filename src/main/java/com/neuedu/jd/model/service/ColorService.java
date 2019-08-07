package com.neuedu.jd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Color;
import com.neuedu.jd.model.mapper.ColorMapper;

@Service
public class ColorService {

	@Autowired
	private ColorMapper colorMapper;
	
	public List<Color> selectColorByCid(int cid) {
		return colorMapper.selectColorByCid(cid);
	}
	
}
