package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingBeauty;
import com.neusoft.bean.TeamshoppingBeautyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingBeautyMapper {
    int countByExample(TeamshoppingBeautyExample example);

    int deleteByExample(TeamshoppingBeautyExample example);

    int deleteByPrimaryKey(Integer tsBeautyId);

    int insert(TeamshoppingBeauty record);

    int insertSelective(TeamshoppingBeauty record);

    List<TeamshoppingBeauty> selectByExample(TeamshoppingBeautyExample example);

    TeamshoppingBeauty selectByPrimaryKey(Integer tsBeautyId);

    int updateByExampleSelective(@Param("record") TeamshoppingBeauty record, @Param("example") TeamshoppingBeautyExample example);

    int updateByExample(@Param("record") TeamshoppingBeauty record, @Param("example") TeamshoppingBeautyExample example);

    int updateByPrimaryKeySelective(TeamshoppingBeauty record);

    int updateByPrimaryKey(TeamshoppingBeauty record);
}