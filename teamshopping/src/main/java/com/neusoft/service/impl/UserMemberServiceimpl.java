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
	 * ���usermember�û�
	 * ����0��1
	 */
	public int addUserMember(UserMember userMember) {
		return 0;
	}
	/**
	 * ����id��ѯusermember
	 * ����usermember����
	 */
	public UserMember getUserMemberById(Integer id) {
		UserMember userMember=userMemberMapper.getUserMemberById(id);
		return userMember;
	}
	/**
	 * ����û����Ƿ����
	 */
	public UserMember getUserMemberByName(String name) {
		UserMember userMember=userMemberMapper.getUserMemberByName(name);
		return userMember;
	}
	/**
	 * �޸�����
	 */
	public int updateMemberPass(Map<String, String> list) {
		int rs=userMemberMapper.updateMemberPass(list);
		return rs;
	}
	/**
	 * ��½
	 */
	public UserMember login(Map<String, String> map) {
		UserMember usermember= userMemberMapper.login(map);
		return usermember;
	}
	

}
