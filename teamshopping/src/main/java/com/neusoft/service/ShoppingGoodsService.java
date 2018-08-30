package com.neusoft.service;

import com.neusoft.pojo.Pager;
import com.neusoft.pojo.TeamshoppingGoods;


public interface ShoppingGoodsService {
	Pager<TeamshoppingGoods> getPager(int type,int pageIndex, int pageSize);
}
