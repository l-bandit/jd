package com.neuedu.jd.model.mapper;

import java.util.List;

import com.neuedu.jd.model.bean.Size;

public interface SizeMapper {

	public List<Size> selectSizeByCid(int cid);
	
}
