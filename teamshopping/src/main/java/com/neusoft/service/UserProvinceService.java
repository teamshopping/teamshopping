package com.neusoft.service;


import com.neusoft.pojo.Pager;
import com.neusoft.pojo.UserProvince;

public interface UserProvinceService {
	Pager<UserProvince> getPager(int pageIndex, int pageSize);
}
