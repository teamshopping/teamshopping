package com.neusoft.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.pojo.UserMember;
import com.neusoft.service.UserMemberService;

@Controller
@RequestMapping("/memter")
public class UserMemterController {
	@Autowired
	private UserMemberService userMemberService;
	
	@RequestMapping(value="/regist")
	public ModelAndView RegistMemter(@RequestBody UserMember userMember) {
		ModelAndView model=new ModelAndView("/member/regist");
		int rs = userMemberService.addUserMember(userMember);
		model.addObject("rs",rs);
		return model;
	}

}
