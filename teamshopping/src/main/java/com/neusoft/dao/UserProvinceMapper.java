package com.neusoft.dao;

import java.util.List;

import com.neusoft.pojo.UserProvince;

public interface UserProvinceMapper {
	/**
	 * 查询所有省
	 * @return
	 */
	List<UserProvince> getUserProvince();
	
}