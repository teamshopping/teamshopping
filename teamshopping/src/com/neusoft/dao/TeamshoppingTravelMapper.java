package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingTravel;
import com.neusoft.bean.TeamshoppingTravelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingTravelMapper {
    int countByExample(TeamshoppingTravelExample example);

    int deleteByExample(TeamshoppingTravelExample example);

    int deleteByPrimaryKey(Integer tsTravelId);

    int insert(TeamshoppingTravel record);

    int insertSelective(TeamshoppingTravel record);

    List<TeamshoppingTravel> selectByExample(TeamshoppingTravelExample example);

    TeamshoppingTravel selectByPrimaryKey(Integer tsTravelId);

    int updateByExampleSelective(@Param("record") TeamshoppingTravel record, @Param("example") TeamshoppingTravelExample example);

    int updateByExample(@Param("record") TeamshoppingTravel record, @Param("example") TeamshoppingTravelExample example);

    int updateByPrimaryKeySelective(TeamshoppingTravel record);

    int updateByPrimaryKey(TeamshoppingTravel record);
}