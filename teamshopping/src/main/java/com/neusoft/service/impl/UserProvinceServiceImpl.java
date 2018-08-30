package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserProvinceMapper;
import com.neusoft.pojo.UserProvince;
import com.neusoft.service.UserProvinceService;

@Service("userProvinceService")
public class UserProvinceServiceImpl implements UserProvinceService{
	
	@Autowired
	private UserProvinceMapper userProvinceMapper;
	
	/**
	 * 查询所有省
	 */
	public List<UserProvince> getUserProvince() {
		return userProvinceMapper.getUserProvince();
	}

}
