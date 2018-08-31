package com.neusoft.dao;


import java.util.List;
import java.util.Map;

import com.neusoft.pojo.TeamshoppingGoods;


public interface TeamBuyGoodsMapper {
	/**
	 * ����id����Ʒ����
	 */
	public TeamshoppingGoods getGoodsbyId(Integer id);
	/**
	 * ͳ�Ƽ�¼����
	 */
	public int getCount(Integer type);
    /**
     * �����û�������ѯ�û�������Ϣ
     * */
	public List<TeamshoppingGoods> getShoppingByWhere(Map<String, Object> where);
}
