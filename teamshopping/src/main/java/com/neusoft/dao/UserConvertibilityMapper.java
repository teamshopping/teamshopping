package com.neusoft.dao;

import com.neusoft.bean.UserConvertibility;
import com.neusoft.bean.UserConvertibilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserConvertibilityMapper {
    int countByExample(UserConvertibilityExample example);

    int deleteByExample(UserConvertibilityExample example);

    int deleteByPrimaryKey(Integer uConvertibilityId);

    int insert(UserConvertibility record);

    int insertSelective(UserConvertibility record);

    List<UserConvertibility> selectByExample(UserConvertibilityExample example);

    UserConvertibility selectByPrimaryKey(Integer uConvertibilityId);

    int updateByExampleSelective(@Param("record") UserConvertibility record, @Param("example") UserConvertibilityExample example);

    int updateByExample(@Param("record") UserConvertibility record, @Param("example") UserConvertibilityExample example);

    int updateByPrimaryKeySelective(UserConvertibility record);

    int updateByPrimaryKey(UserConvertibility record);
}