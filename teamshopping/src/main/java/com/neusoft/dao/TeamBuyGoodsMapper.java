package com.neusoft.dao;


import java.util.List;
import java.util.Map;

import com.neusoft.pojo.TeamshoppingGoods;


public interface TeamBuyGoodsMapper {
	/**
	 * ͳ�Ƽ�¼����
	 */
	int getCount(Integer type);
    /**
     * �����û�������ѯ�û�������Ϣ
     * */
	List<TeamshoppingGoods> getShoppingByWhere(Map<String, Object> where);
}
