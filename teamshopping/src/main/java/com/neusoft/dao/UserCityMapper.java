package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.UserCity;

public interface UserCityMapper {
	/**
	 * 查询所有省
	 * @return
	 */
	List<UserCity> getUserCity();
}