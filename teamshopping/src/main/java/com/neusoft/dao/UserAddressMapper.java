package com.neusoft.dao;

import java.util.ArrayList;

import com.neusoft.pojo.UserAddress;

public interface UserAddressMapper {
	 /**
		 * 登陆：根据id查询UserAddress
		 * 返回UserAddress对象
		 */
	    ArrayList<UserAddress> loginAddress(Integer id);
	    Integer insertAddress(UserAddress userAddress);
}