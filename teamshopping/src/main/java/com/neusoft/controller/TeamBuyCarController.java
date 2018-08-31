package com.neusoft.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.pojo.TeamshoppingBuyCar;
import com.neusoft.service.BuyCarService;

@Controller
@RequestMapping("/buycar")
public class TeamBuyCarController {
	
	@Autowired
	private BuyCarService buyCarService;
	
	@RequestMapping(value="/add")
	public String addcommodity(TeamshoppingBuyCar commodity) {
	
		buyCarService.intoCommodity(commodity);
		
		return "forword:/product-view";
	}
	
	@RequestMapping("/all")
	public ModelAndView allcommdity() {
		ArrayList<TeamshoppingBuyCar> list=buyCarService.allCommodity();
		ModelAndView model = new ModelAndView("/buycar");//÷ÿ∂®œÚ
		model.addObject("list",list);
		return model;
	}
}
