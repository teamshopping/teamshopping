package com.neusoft.dao;

import com.neusoft.bean.UserIntegral;
import com.neusoft.bean.UserIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIntegralMapper {
    int countByExample(UserIntegralExample example);

    int deleteByExample(UserIntegralExample example);

    int deleteByPrimaryKey(Integer uIntegralId);

    int insert(UserIntegral record);

    int insertSelective(UserIntegral record);

    List<UserIntegral> selectByExample(UserIntegralExample example);

    UserIntegral selectByPrimaryKey(Integer uIntegralId);

    int updateByExampleSelective(@Param("record") UserIntegral record, @Param("example") UserIntegralExample example);

    int updateByExample(@Param("record") UserIntegral record, @Param("example") UserIntegralExample example);

    int updateByPrimaryKeySelective(UserIntegral record);

    int updateByPrimaryKey(UserIntegral record);
}