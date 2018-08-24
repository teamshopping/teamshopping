package com.neusoft.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neusoft.pojo.UserAddress;
import com.neusoft.pojo.UserArea;
import com.neusoft.pojo.UserCity;
import com.neusoft.pojo.UserMember;
import com.neusoft.pojo.UserProvince;
import com.neusoft.service.UserAddressService;
import com.neusoft.service.UserAreaService;
import com.neusoft.service.UserCityService;
import com.neusoft.service.UserMemberService;
import com.neusoft.service.UserProvinceService;

@Controller
@RequestMapping("/memter")
public class UserMemterController {
	@Autowired
	private UserMemberService userMemberService;
	
	@Autowired
	private UserAddressService userAddressService;
	
	@Autowired
	private UserProvinceService userProvinceService;
	
	@Autowired
	private UserCityService userCityService;
	
	@Autowired
	private UserAreaService userAreaService;
	/**
	 * 注册 userMember
	 * @param userMember
	 * @return 0或1
	 */
	@RequestMapping(value="/regist")
	public ModelAndView RegistMemter(@RequestBody UserMember userMember) {
		ModelAndView model=new ModelAndView("member/regist");
		int rs = userMemberService.addUserMember(userMember);
		model.addObject("rs",rs);
		return model;
	}
	/**
	 * 根据id查询usermember对象
	 * @param id
	 * @return usermember
	 */
	@RequestMapping(value="/getusermember")
	public ModelAndView getuserMember(Integer id) {
		ModelAndView model=new ModelAndView("member/usermember");
		UserMember userMember = userMemberService.getUserMemberById(id);
		model.addObject("userMember",userMember);
		return model;
	}
	/**
	 * 检查用户名是否存在
	 * @param name
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value="/usermembername")
	public @ResponseBody  String userMemberName(@RequestParam String name,HttpSession session) throws Exception {
		UserMember userMember = userMemberService.getUserMemberByName(name);
		ObjectMapper map=new ObjectMapper();
		if(userMember==null) 
		{
			String str="notOk";
			String josn=map.writeValueAsString(str);
			return josn;
		}
		else 
		{
			session.setAttribute("userMember",userMember);
			String str="ok";
			String josn=map.writeValueAsString(str);
			return josn;
		}
	}
	/**
	 * 检查绑定手机或邮箱是否正确
	 * @param bind
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value="/usermemberbind")
	public @ResponseBody  String userMemberBind(@RequestParam String bind,HttpSession session) throws Exception {
		ObjectMapper map=new ObjectMapper();
		UserMember userMember=(UserMember)session.getAttribute("userMember");
		if(userMember.getuMemberEmail().equals(bind) || userMember.getuMemberPhone().equals(bind)) 
		{
			String str="ok";
			String josn=map.writeValueAsString(str);
			return josn;
		}
		else 
		{
			String str="notOk";
			String josn=map.writeValueAsString(str);
			return josn;
		}
	}
	/**
	 * 修改密码
	 * @param pass
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value="/usermemberpass")
	public @ResponseBody String userMemberPass(@RequestParam String pass,HttpSession session) throws Exception {
		UserMember userMember=(UserMember)session.getAttribute("userMember");
		HashMap<String, String> list=new HashMap<String, String>();
		list.put("pass", pass);
		list.put("name", userMember.getuMemberName());
		userMemberService.updateMemberPass(list);
		session.removeAttribute("user");
		ObjectMapper map=new ObjectMapper();
		String str="ok";
		String josn=map.writeValueAsString(str);
		return josn;
	}
	/**
	 * 登陆
	 */
	@RequestMapping(value="/login")
	public String login(@RequestParam String name,@RequestParam String pass,HttpSession session,RedirectAttributes reponse) throws Exception {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("name", name);
		map.put("pass", pass);
		UserMember usermember = userMemberService.login(map);
		
		if(usermember != null) 
		{
			Integer id=usermember.getuMemberId();
			ArrayList<UserAddress> useraddress=userAddressService.loginAddress(id);
			usermember.setAddress(useraddress);
			session.setAttribute("usermember", usermember);
			return "redirect:../teamshopping/index.jsp";
		}
		else {
			reponse.addFlashAttribute("isnull","账号不存在");
			return "redirect:../usermember/login.html";
		}

	}
	/**
	 * 查询所有省市区
	 * @return 省市区集合
	 * @throws JsonProcessingException 
	 */
	@RequestMapping(value="/getaddress",method={RequestMethod.POST,RequestMethod.GET},produces = "application/json;charset=UTF-8")
	public @ResponseBody String getaddress() throws JsonProcessingException {
		List<UserProvince> userprovince=userProvinceService.getUserProvince();
		List<UserCity> usercity=userCityService.getUserCity();
		List<UserArea> userarea=userAreaService.getUserArea();
		HashMap<String,Object> hashmap=new HashMap<String, Object>();
		hashmap.put("province", userprovince);
		hashmap.put("city", usercity);
		hashmap.put("area", userarea);
		ObjectMapper map=new ObjectMapper();
		String json=map.writeValueAsString(hashmap);
		return json;
	}
}
