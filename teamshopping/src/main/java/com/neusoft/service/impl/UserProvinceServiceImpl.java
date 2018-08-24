package com.neusoft.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserProvinceMapper;
import com.neusoft.pojo.Pager;
import com.neusoft.pojo.UserProvince;
import com.neusoft.service.UserProvinceService;

@Service("userProvinceService")
public class UserProvinceServiceImpl implements UserProvinceService{
	
	@Autowired
	private UserProvinceMapper userProvinceMapper;
	
	/**
	 * ����������ѯ��ҳ
	 */
	public Pager<UserProvince> getPager(int pageIndex, int pageSize) {
		int stratIndex = (pageIndex - 1) * pageSize;// �������ʼ��ҳֵ
		int dataCount = userProvinceMapper.getCount();
		Map<String,Object> where=new HashMap<String,Object>();
		where.put("stratIndex",stratIndex);
		where.put("pageSize", pageSize);
		List<UserProvince> list = userProvinceMapper.getUserProvinceByWhere(where);
		//��֯ͨ�÷���ҳ
		Pager<UserProvince> pager= new Pager<UserProvince>(pageIndex, pageSize, dataCount, list);
		return pager;
	}
	/**
	 * ��ѯ����ʡ
	 */
	public List<UserProvince> getUserProvince() {
		return userProvinceMapper.getUserProvince();
	}

}
