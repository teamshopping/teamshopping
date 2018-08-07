package com.neusoft.dao;

import com.neusoft.bean.UserProvince;
import com.neusoft.bean.UserProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProvinceMapper {
    int countByExample(UserProvinceExample example);

    int deleteByExample(UserProvinceExample example);

    int deleteByPrimaryKey(Integer uProvinceId);

    int insert(UserProvince record);

    int insertSelective(UserProvince record);

    List<UserProvince> selectByExample(UserProvinceExample example);

    UserProvince selectByPrimaryKey(Integer uProvinceId);

    int updateByExampleSelective(@Param("record") UserProvince record, @Param("example") UserProvinceExample example);

    int updateByExample(@Param("record") UserProvince record, @Param("example") UserProvinceExample example);

    int updateByPrimaryKeySelective(UserProvince record);

    int updateByPrimaryKey(UserProvince record);
}