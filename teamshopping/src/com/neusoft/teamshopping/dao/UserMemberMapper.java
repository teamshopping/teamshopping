package com.neusoft.teamshopping.dao;

import org.springframework.stereotype.Repository;

import com.neusoft.teamshopping.bean.UserMember;

@Repository("userMapper")
public interface UserMemberMapper {

    UserMember selectByPrimaryKey(Integer id);

}