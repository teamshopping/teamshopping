package com.neusoft.service;

import java.util.ArrayList;

import com.neusoft.pojo.TeamshoppingBuyCar;

public interface BuyCarService {
	public int intoCommodity(TeamshoppingBuyCar commodity);
	/**
	 * ��������
	 */
	public ArrayList<TeamshoppingBuyCar> allCommodity();
}
