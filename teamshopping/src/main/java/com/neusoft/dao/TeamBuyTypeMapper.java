package com.neusoft.dao;

import java.util.ArrayList;

import com.neusoft.pojo.TeamshoppingType;

public interface TeamBuyTypeMapper {
	/**
	 * 获得所有分类
	 * @return
	 */
	public ArrayList<TeamshoppingType> getAllType();
}
