package com.neusoft.dao;

import java.util.ArrayList;

import com.neusoft.pojo.TeamshoppingBuyCar;

public interface TeamBuyCarMapper {
	/**
	 * �����Ʒ�����ﳵ
	 */
	public int intoCommodity(TeamshoppingBuyCar commodity);
	/**
	 * ��������
	 */
	public ArrayList<TeamshoppingBuyCar> allCommodity();
	
}
