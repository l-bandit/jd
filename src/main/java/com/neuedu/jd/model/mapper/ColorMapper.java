package com.neuedu.jd.model.mapper;

import java.util.List;

import com.neuedu.jd.model.bean.Color;

public interface ColorMapper {

	public List<Color> selectColorByCid(int cid);
	
}
