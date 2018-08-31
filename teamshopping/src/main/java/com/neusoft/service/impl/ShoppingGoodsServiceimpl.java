package com.neusoft.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.TeamBuyGoodsMapper;
import com.neusoft.pojo.Pager;
import com.neusoft.pojo.TeamshoppingGoods;
import com.neusoft.service.ShoppingGoodsService;


@Service("shoppingGoodsService")
public class ShoppingGoodsServiceimpl implements ShoppingGoodsService{
	@Autowired
	private TeamBuyGoodsMapper teamBuyGoodsMapper;

	/**
	 * 根据条件查询分页
	 */
	public Pager<TeamshoppingGoods> getPager(int type,int pageIndex, int pageSize) {
		int stratIndex = (pageIndex - 1) * pageSize;// 计算出起始分页值
		int dataCount = teamBuyGoodsMapper.getCount(type);
		Map<String,Object> where=new HashMap<String,Object>();
		where.put("type", type);
		where.put("stratIndex",stratIndex);
		where.put("pageSize", pageSize);
		List<TeamshoppingGoods> list = teamBuyGoodsMapper.getShoppingByWhere(where);
		//组织通用分类页
		Pager<TeamshoppingGoods> pager= new Pager<TeamshoppingGoods>(pageIndex, pageSize, dataCount, list);
		return pager;
	}
	/**
	 * 根据id查商品对象
	 */
	
	public TeamshoppingGoods getGoodsbyId(int id) {
		return teamBuyGoodsMapper.getGoodsbyId(id);
	}
}
