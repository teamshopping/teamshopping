package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import com.neusoft.pojo.UserProvince;

public interface UserProvinceMapper {
	/**
	 * ��ѯ����ʡ
	 * @return
	 */
	List<UserProvince> getUserProvince();
	/**
	 * ͳ�Ƽ�¼����
	 */
	int getCount();
    /**
     * �����û�������ѯ�û�������Ϣ
     * */
	List<UserProvince> getUserProvinceByWhere(Map<String, Object> where);
}