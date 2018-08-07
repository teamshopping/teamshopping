package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingTelevision;
import com.neusoft.bean.TeamshoppingTelevisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingTelevisionMapper {
    int countByExample(TeamshoppingTelevisionExample example);

    int deleteByExample(TeamshoppingTelevisionExample example);

    int deleteByPrimaryKey(Integer tsTvId);

    int insert(TeamshoppingTelevision record);

    int insertSelective(TeamshoppingTelevision record);

    List<TeamshoppingTelevision> selectByExample(TeamshoppingTelevisionExample example);

    TeamshoppingTelevision selectByPrimaryKey(Integer tsTvId);

    int updateByExampleSelective(@Param("record") TeamshoppingTelevision record, @Param("example") TeamshoppingTelevisionExample example);

    int updateByExample(@Param("record") TeamshoppingTelevision record, @Param("example") TeamshoppingTelevisionExample example);

    int updateByPrimaryKeySelective(TeamshoppingTelevision record);

    int updateByPrimaryKey(TeamshoppingTelevision record);
}