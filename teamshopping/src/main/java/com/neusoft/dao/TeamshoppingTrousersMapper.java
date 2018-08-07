package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingTrousers;
import com.neusoft.bean.TeamshoppingTrousersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingTrousersMapper {
    int countByExample(TeamshoppingTrousersExample example);

    int deleteByExample(TeamshoppingTrousersExample example);

    int deleteByPrimaryKey(Integer tsTrousersId);

    int insert(TeamshoppingTrousers record);

    int insertSelective(TeamshoppingTrousers record);

    List<TeamshoppingTrousers> selectByExample(TeamshoppingTrousersExample example);

    TeamshoppingTrousers selectByPrimaryKey(Integer tsTrousersId);

    int updateByExampleSelective(@Param("record") TeamshoppingTrousers record, @Param("example") TeamshoppingTrousersExample example);

    int updateByExample(@Param("record") TeamshoppingTrousers record, @Param("example") TeamshoppingTrousersExample example);

    int updateByPrimaryKeySelective(TeamshoppingTrousers record);

    int updateByPrimaryKey(TeamshoppingTrousers record);
}