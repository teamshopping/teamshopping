package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingFresh;
import com.neusoft.bean.TeamshoppingFreshExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingFreshMapper {
    int countByExample(TeamshoppingFreshExample example);

    int deleteByExample(TeamshoppingFreshExample example);

    int deleteByPrimaryKey(Integer tsFreshId);

    int insert(TeamshoppingFresh record);

    int insertSelective(TeamshoppingFresh record);

    List<TeamshoppingFresh> selectByExample(TeamshoppingFreshExample example);

    TeamshoppingFresh selectByPrimaryKey(Integer tsFreshId);

    int updateByExampleSelective(@Param("record") TeamshoppingFresh record, @Param("example") TeamshoppingFreshExample example);

    int updateByExample(@Param("record") TeamshoppingFresh record, @Param("example") TeamshoppingFreshExample example);

    int updateByPrimaryKeySelective(TeamshoppingFresh record);

    int updateByPrimaryKey(TeamshoppingFresh record);
}