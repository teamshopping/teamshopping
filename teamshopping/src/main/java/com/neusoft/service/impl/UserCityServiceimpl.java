package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserCityMapper;
import com.neusoft.pojo.UserCity;
import com.neusoft.service.UserCityService;

@Service("userCityService")
public class UserCityServiceimpl implements UserCityService{
	
	@Autowired
	private UserCityMapper userCityMapper;
	
	/**
	 * 返回所有市
	 */
	public List<UserCity> getUserCity() {
		
		return userCityMapper.getUserCity();
	}

}
