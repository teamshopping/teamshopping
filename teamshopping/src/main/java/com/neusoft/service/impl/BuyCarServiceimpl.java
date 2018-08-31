package com.neusoft.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.TeamBuyCarMapper;
import com.neusoft.pojo.TeamshoppingBuyCar;
import com.neusoft.service.BuyCarService;

@Service("buyCarService")
public class BuyCarServiceimpl implements BuyCarService{
	@Autowired
	private TeamBuyCarMapper teamBuyCarMapper;

	public int intoCommodity(TeamshoppingBuyCar commodity) {
		
		return teamBuyCarMapper.intoCommodity(commodity);
	}
	/**
	 * ≤È’“À˘”–
	 */
	public ArrayList<TeamshoppingBuyCar> allCommodity() {
		
		return teamBuyCarMapper.allCommodity();
	}

}
