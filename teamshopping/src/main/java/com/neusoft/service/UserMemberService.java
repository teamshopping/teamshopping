package com.neusoft.service;

import java.util.Map;

import com.neusoft.pojo.UserMember;

public interface UserMemberService {
	 int addUserMember(UserMember userMember);
	 UserMember getUserMemberById(Integer id);
	 UserMember getUserMemberByName(String name);
	 int updateMemberPass(Map<String, String> list);
	 public UserMember getUserMember(UserMember userMember);//≤È—Ø
}
