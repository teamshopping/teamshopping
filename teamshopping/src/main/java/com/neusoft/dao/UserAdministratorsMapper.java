package com.neusoft.dao;

import com.neusoft.bean.UserAdministrators;
import com.neusoft.bean.UserAdministratorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdministratorsMapper {
    int countByExample(UserAdministratorsExample example);

    int deleteByExample(UserAdministratorsExample example);

    int deleteByPrimaryKey(Integer uAdministrators);

    int insert(UserAdministrators record);

    int insertSelective(UserAdministrators record);

    List<UserAdministrators> selectByExample(UserAdministratorsExample example);

    UserAdministrators selectByPrimaryKey(Integer uAdministrators);

    int updateByExampleSelective(@Param("record") UserAdministrators record, @Param("example") UserAdministratorsExample example);

    int updateByExample(@Param("record") UserAdministrators record, @Param("example") UserAdministratorsExample example);

    int updateByPrimaryKeySelective(UserAdministrators record);

    int updateByPrimaryKey(UserAdministrators record);
}