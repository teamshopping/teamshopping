package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserAreaMapper;
import com.neusoft.pojo.UserArea;
import com.neusoft.service.UserAreaService;

@Service("userAreaService")
public class UserAreaServiceimpl implements UserAreaService{
	
	@Autowired
	private UserAreaMapper userAreaMapper;

	public List<UserArea> getUserArea() {

		return userAreaMapper.getUserArea();
	}

}
