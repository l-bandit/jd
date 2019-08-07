package com.neuedu.jd.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.jd.model.bean.Size;
import com.neuedu.jd.model.mapper.SizeMapper;

@Service
public class SizeService {

	@Autowired
	private SizeMapper sizeMapper;
	
	public List<Size> selectSizeByCid(int cid) {
		return sizeMapper.selectSizeByCid(cid);
	}
	
}
