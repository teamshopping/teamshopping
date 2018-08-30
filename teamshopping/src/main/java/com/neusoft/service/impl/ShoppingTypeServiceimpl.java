package com.neusoft.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.TeamBuyTypeMapper;
import com.neusoft.pojo.TeamshoppingType;
import com.neusoft.service.ShoppingTypeService;

@Service("shoppingTypeService")
public class ShoppingTypeServiceimpl implements ShoppingTypeService{
	
	@Autowired
	private TeamBuyTypeMapper teamBuyTypeMapper;
	
	public ArrayList<TeamshoppingType> getAllType() {
		
		return teamBuyTypeMapper.getAllType();
	}

}
