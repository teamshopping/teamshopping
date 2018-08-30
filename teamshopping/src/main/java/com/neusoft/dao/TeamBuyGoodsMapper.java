package com.neusoft.dao;


import java.util.List;
import java.util.Map;

import com.neusoft.pojo.TeamshoppingGoods;


public interface TeamBuyGoodsMapper {
	/**
	 * 统计记录条数
	 */
	int getCount(Integer type);
    /**
     * 根据用户条件查询用户类型信息
     * */
	List<TeamshoppingGoods> getShoppingByWhere(Map<String, Object> where);
}
