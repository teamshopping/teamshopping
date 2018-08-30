package com.neusoft.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neusoft.pojo.TeamshoppingType;
import com.neusoft.service.ShoppingTypeService;

@Controller
@RequestMapping("/commodity")
public class TeamBuyType {
	
	@Autowired
	private ShoppingTypeService shoppingTypeService;
	
	@RequestMapping(value="/alltype",produces = "application/json;charset=UTF-8")
	public @ResponseBody String  getAllType() throws JsonProcessingException{
		ArrayList<TeamshoppingType> list=shoppingTypeService.getAllType();
		ObjectMapper map=new ObjectMapper();
		String json=map.writeValueAsString(list);
		return json;
	}
}
