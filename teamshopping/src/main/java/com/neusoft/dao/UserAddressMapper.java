package com.neusoft.dao;

import java.util.ArrayList;

import com.neusoft.pojo.UserAddress;

public interface UserAddressMapper {
	 /**
		 * ��½������id��ѯUserAddress
		 * ����UserAddress����
		 */
	    ArrayList<UserAddress> loginAddress(Integer id);
	    Integer insertAddress(UserAddress userAddress);
}