package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingGame;
import com.neusoft.bean.TeamshoppingGameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingGameMapper {
    int countByExample(TeamshoppingGameExample example);

    int deleteByExample(TeamshoppingGameExample example);

    int deleteByPrimaryKey(Integer tsGameId);

    int insert(TeamshoppingGame record);

    int insertSelective(TeamshoppingGame record);

    List<TeamshoppingGame> selectByExample(TeamshoppingGameExample example);

    TeamshoppingGame selectByPrimaryKey(Integer tsGameId);

    int updateByExampleSelective(@Param("record") TeamshoppingGame record, @Param("example") TeamshoppingGameExample example);

    int updateByExample(@Param("record") TeamshoppingGame record, @Param("example") TeamshoppingGameExample example);

    int updateByPrimaryKeySelective(TeamshoppingGame record);

    int updateByPrimaryKey(TeamshoppingGame record);
}