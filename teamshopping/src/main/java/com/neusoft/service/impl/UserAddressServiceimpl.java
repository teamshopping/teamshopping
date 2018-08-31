package com.neusoft.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserAddressMapper;
import com.neusoft.pojo.UserAddress;
import com.neusoft.service.UserAddressService;

@Service("userAddressService")
public class UserAddressServiceimpl implements UserAddressService{
	
	@Autowired
	private UserAddressMapper useraddressMapper;

	/**
	 * µÇÂ½£ºuseraddress¶ÔÏó
	 */
	public ArrayList<UserAddress> loginAddress(Integer id) {
		ArrayList<UserAddress> useraddress=useraddressMapper.loginAddress(id);
		return useraddress;
	}
	public Integer insertAddress(UserAddress userAddress) {
		
		return useraddressMapper.insertAddress(userAddress);
	}
}
