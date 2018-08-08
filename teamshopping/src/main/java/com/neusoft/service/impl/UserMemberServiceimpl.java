package com.neusoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserMemberMapper;
import com.neusoft.pojo.UserMember;
import com.neusoft.service.UserMemberService;

@Service("userMemberService")
public class UserMemberServiceimpl implements UserMemberService{
	@Autowired
	private UserMemberMapper userMemberMapper;

	public int addUserMember(UserMember userMember) {
		
		return 0;
	}

}
