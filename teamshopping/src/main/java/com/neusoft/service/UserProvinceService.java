package com.neusoft.service;


import java.util.List;

import com.neusoft.pojo.Pager;
import com.neusoft.pojo.UserProvince;

public interface UserProvinceService {
	List<UserProvince> getUserProvince();
	Pager<UserProvince> getPager(int pageIndex, int pageSize);
}
