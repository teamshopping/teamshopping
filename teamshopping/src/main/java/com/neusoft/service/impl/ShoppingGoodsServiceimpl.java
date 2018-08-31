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
	 * ����������ѯ��ҳ
	 */
	public Pager<TeamshoppingGoods> getPager(int type,int pageIndex, int pageSize) {
		int stratIndex = (pageIndex - 1) * pageSize;// �������ʼ��ҳֵ
		int dataCount = teamBuyGoodsMapper.getCount(type);
		Map<String,Object> where=new HashMap<String,Object>();
		where.put("type", type);
		where.put("stratIndex",stratIndex);
		where.put("pageSize", pageSize);
		List<TeamshoppingGoods> list = teamBuyGoodsMapper.getShoppingByWhere(where);
		//��֯ͨ�÷���ҳ
		Pager<TeamshoppingGoods> pager= new Pager<TeamshoppingGoods>(pageIndex, pageSize, dataCount, list);
		return pager;
	}
	/**
	 * ����id����Ʒ����
	 */
	
	public TeamshoppingGoods getGoodsbyId(int id) {
		return teamBuyGoodsMapper.getGoodsbyId(id);
	}
}
