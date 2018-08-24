package com.neusoft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.pojo.Pager;
import com.neusoft.pojo.UserProvince;
import com.neusoft.service.UserProvinceService;

@Controller
@RequestMapping("/userProvince")
public class UserProvinceMapperController {
	@Autowired
	private UserProvinceService userProvinceService;
	
	@RequestMapping(value = "/list")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("/member/usermember");
		String list="66";
		model.addObject("list", list);
		return model;
	}
	
	@RequestMapping(value="/Pager/{pageSize}/{pageIndex}")
	public ModelAndView getPager(@PathVariable("pageSize") int pageSize, @PathVariable("pageIndex") int pageIndex) {
		ModelAndView model = new ModelAndView("member/list");
		Pager<UserProvince> pager = userProvinceService.getPager(pageIndex, pageSize);
		model.addObject("pager", pager);
		return model;
		
	}
}
