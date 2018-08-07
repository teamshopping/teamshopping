package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingMusical;
import com.neusoft.bean.TeamshoppingMusicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingMusicalMapper {
    int countByExample(TeamshoppingMusicalExample example);

    int deleteByExample(TeamshoppingMusicalExample example);

    int deleteByPrimaryKey(Integer tsMusicalId);

    int insert(TeamshoppingMusical record);

    int insertSelective(TeamshoppingMusical record);

    List<TeamshoppingMusical> selectByExample(TeamshoppingMusicalExample example);

    TeamshoppingMusical selectByPrimaryKey(Integer tsMusicalId);

    int updateByExampleSelective(@Param("record") TeamshoppingMusical record, @Param("example") TeamshoppingMusicalExample example);

    int updateByExample(@Param("record") TeamshoppingMusical record, @Param("example") TeamshoppingMusicalExample example);

    int updateByPrimaryKeySelective(TeamshoppingMusical record);

    int updateByPrimaryKey(TeamshoppingMusical record);
}