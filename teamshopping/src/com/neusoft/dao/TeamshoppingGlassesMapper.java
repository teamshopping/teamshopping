package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingGlasses;
import com.neusoft.bean.TeamshoppingGlassesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingGlassesMapper {
    int countByExample(TeamshoppingGlassesExample example);

    int deleteByExample(TeamshoppingGlassesExample example);

    int deleteByPrimaryKey(Integer tsGlassesId);

    int insert(TeamshoppingGlasses record);

    int insertSelective(TeamshoppingGlasses record);

    List<TeamshoppingGlasses> selectByExample(TeamshoppingGlassesExample example);

    TeamshoppingGlasses selectByPrimaryKey(Integer tsGlassesId);

    int updateByExampleSelective(@Param("record") TeamshoppingGlasses record, @Param("example") TeamshoppingGlassesExample example);

    int updateByExample(@Param("record") TeamshoppingGlasses record, @Param("example") TeamshoppingGlassesExample example);

    int updateByPrimaryKeySelective(TeamshoppingGlasses record);

    int updateByPrimaryKey(TeamshoppingGlasses record);
}