package com.neusoft.dao;

import java.util.Map;

import com.neusoft.pojo.UserMember;

public interface UserMemberMapper {
	/**
	 * ���usermember�û�
	 * ����0��1
	 */
    int addUserMember(UserMember userMember);
    /**
	 * ����id��ѯusermember
	 * ����usermember����
	 */
    UserMember getUserMemberById(Integer id);
    /**
	 * ����������ѯusermember
	 * ����usermember����
	 */
    UserMember getUserMemberByName(String name);
    /**
	 * �޸�����
	 * ����0��1
	 */
    int updateMemberPass(Map<String, String> list);
    public UserMember getUserMember(UserMember userMember);//��ѯ
}