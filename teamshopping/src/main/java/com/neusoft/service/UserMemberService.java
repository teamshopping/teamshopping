package com.neusoft.service;

import java.util.ArrayList;
import java.util.Map;

import com.neusoft.pojo.UserAddress;
import com.neusoft.pojo.UserMember;

public interface UserMemberService {
	 int addUserMember(UserMember userMember);
	 UserMember getUserMemberById(Integer id);
	 UserMember getUserMemberByName(String name);
	 UserMember login(Map<String,String> map);
	 int updateMemberPass(Map<String, String> list);
}
