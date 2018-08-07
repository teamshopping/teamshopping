package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingFinefood;
import com.neusoft.bean.TeamshoppingFinefoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingFinefoodMapper {
    int countByExample(TeamshoppingFinefoodExample example);

    int deleteByExample(TeamshoppingFinefoodExample example);

    int deleteByPrimaryKey(Integer tsFinefoodId);

    int insert(TeamshoppingFinefood record);

    int insertSelective(TeamshoppingFinefood record);

    List<TeamshoppingFinefood> selectByExample(TeamshoppingFinefoodExample example);

    TeamshoppingFinefood selectByPrimaryKey(Integer tsFinefoodId);

    int updateByExampleSelective(@Param("record") TeamshoppingFinefood record, @Param("example") TeamshoppingFinefoodExample example);

    int updateByExample(@Param("record") TeamshoppingFinefood record, @Param("example") TeamshoppingFinefoodExample example);

    int updateByPrimaryKeySelective(TeamshoppingFinefood record);

    int updateByPrimaryKey(TeamshoppingFinefood record);
}