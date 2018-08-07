package com.neusoft.dao;

import com.neusoft.bean.UserCity;
import com.neusoft.bean.UserCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCityMapper {
    int countByExample(UserCityExample example);

    int deleteByExample(UserCityExample example);

    int deleteByPrimaryKey(Integer uCityId);

    int insert(UserCity record);

    int insertSelective(UserCity record);

    List<UserCity> selectByExample(UserCityExample example);

    UserCity selectByPrimaryKey(Integer uCityId);

    int updateByExampleSelective(@Param("record") UserCity record, @Param("example") UserCityExample example);

    int updateByExample(@Param("record") UserCity record, @Param("example") UserCityExample example);

    int updateByPrimaryKeySelective(UserCity record);

    int updateByPrimaryKey(UserCity record);
}