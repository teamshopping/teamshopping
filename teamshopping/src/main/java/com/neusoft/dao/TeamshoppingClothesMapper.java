package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingClothes;
import com.neusoft.bean.TeamshoppingClothesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingClothesMapper {
    int countByExample(TeamshoppingClothesExample example);

    int deleteByExample(TeamshoppingClothesExample example);

    int deleteByPrimaryKey(Integer tsClothesId);

    int insert(TeamshoppingClothes record);

    int insertSelective(TeamshoppingClothes record);

    List<TeamshoppingClothes> selectByExample(TeamshoppingClothesExample example);

    TeamshoppingClothes selectByPrimaryKey(Integer tsClothesId);

    int updateByExampleSelective(@Param("record") TeamshoppingClothes record, @Param("example") TeamshoppingClothesExample example);

    int updateByExample(@Param("record") TeamshoppingClothes record, @Param("example") TeamshoppingClothesExample example);

    int updateByPrimaryKeySelective(TeamshoppingClothes record);

    int updateByPrimaryKey(TeamshoppingClothes record);
}