package com.neusoft.service.impl;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserMemberMapper;
import com.neusoft.pojo.UserMember;
import com.neusoft.service.UserMemberService;

@Service("userMemberService")
public class UserMemberServiceimpl implements UserMemberService{
	@Autowired
	private UserMemberMapper userMemberMapper;

	/**
	 * 添加usermember用户
	 * 返回0或1
	 */
	public int addUserMember(UserMember userMember) {
		return 0;
	}
	/**
	 * 根据id查询usermember
	 * 返回usermember对象
	 */
	public UserMember getUserMemberById(Integer id) {
		UserMember userMember=userMemberMapper.getUserMemberById(id);
		return userMember;
	}
	/**
	 * 检查用户名是否存在
	 */
	public UserMember getUserMemberByName(String name) {
		UserMember userMember=userMemberMapper.getUserMemberByName(name);
		return userMember;
	}
	/**
	 * 修改密码
	 */
	public int updateMemberPass(Map<String, String> list) {
		int rs=userMemberMapper.updateMemberPass(list);
		return rs;
	}
	/**
	 * 登陆
	 */
	public UserMember login(Map<String, String> map) {
		UserMember usermember= userMemberMapper.login(map);
		return usermember;
	}
	

}
