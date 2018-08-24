package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import com.neusoft.pojo.UserProvince;

public interface UserProvinceMapper {
	/**
	 * 查询所有省
	 * @return
	 */
	List<UserProvince> getUserProvince();
	/**
	 * 统计记录条数
	 */
	int getCount();
    /**
     * 根据用户条件查询用户类型信息
     * */
	List<UserProvince> getUserProvinceByWhere(Map<String, Object> where);
}