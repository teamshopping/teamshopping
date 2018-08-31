package com.neusoft.dao;

import java.util.ArrayList;

import com.neusoft.pojo.TeamshoppingBuyCar;

public interface TeamBuyCarMapper {
	/**
	 * 添加商品到购物车
	 */
	public int intoCommodity(TeamshoppingBuyCar commodity);
	/**
	 * 查找所有
	 */
	public ArrayList<TeamshoppingBuyCar> allCommodity();
	
}
