package com.neusoft.dao;


import java.util.Map;

import com.neusoft.pojo.UserMember;

public interface UserMemberMapper {
	/**
	 * 添加usermember用户
	 * 返回0或1
	 */
    int addUserMember(UserMember userMember);
    /**
	 * 根据id查询usermember
	 * 返回usermember对象
	 */
    UserMember getUserMemberById(Integer id);
    /**
	 * 根据姓名查询usermember
	 * 返回usermember对象
	 */
    UserMember getUserMemberByName(String name);
    /**
	 * 登陆：根据姓名和密码查询usermember
	 * 返回usermember对象
	 */
    UserMember login(Map<String,String> map);
   
    /**
	 * 修改密码
	 * 返回0或1
	 */
    int updateMemberPass(Map<String, String> list);
}