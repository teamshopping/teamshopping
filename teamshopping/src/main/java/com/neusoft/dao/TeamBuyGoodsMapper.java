package com.neusoft.dao;


import java.util.List;
import java.util.Map;

import com.neusoft.pojo.TeamshoppingGoods;


public interface TeamBuyGoodsMapper {
	/**
	 * 根据id查商品对象
	 */
	public TeamshoppingGoods getGoodsbyId(Integer id);
	/**
	 * 统计记录条数
	 */
	public int getCount(Integer type);
    /**
     * 根据用户条件查询用户类型信息
     * */
	public List<TeamshoppingGoods> getShoppingByWhere(Map<String, Object> where);
}
