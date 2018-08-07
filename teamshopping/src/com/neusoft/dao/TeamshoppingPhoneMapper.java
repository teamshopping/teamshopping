package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingPhone;
import com.neusoft.bean.TeamshoppingPhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingPhoneMapper {
    int countByExample(TeamshoppingPhoneExample example);

    int deleteByExample(TeamshoppingPhoneExample example);

    int deleteByPrimaryKey(Integer tsPhoneId);

    int insert(TeamshoppingPhone record);

    int insertSelective(TeamshoppingPhone record);

    List<TeamshoppingPhone> selectByExample(TeamshoppingPhoneExample example);

    TeamshoppingPhone selectByPrimaryKey(Integer tsPhoneId);

    int updateByExampleSelective(@Param("record") TeamshoppingPhone record, @Param("example") TeamshoppingPhoneExample example);

    int updateByExample(@Param("record") TeamshoppingPhone record, @Param("example") TeamshoppingPhoneExample example);

    int updateByPrimaryKeySelective(TeamshoppingPhone record);

    int updateByPrimaryKey(TeamshoppingPhone record);
}