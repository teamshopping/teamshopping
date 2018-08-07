package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingFurniture;
import com.neusoft.bean.TeamshoppingFurnitureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingFurnitureMapper {
    int countByExample(TeamshoppingFurnitureExample example);

    int deleteByExample(TeamshoppingFurnitureExample example);

    int deleteByPrimaryKey(Integer tsFurnitureId);

    int insert(TeamshoppingFurniture record);

    int insertSelective(TeamshoppingFurniture record);

    List<TeamshoppingFurniture> selectByExample(TeamshoppingFurnitureExample example);

    TeamshoppingFurniture selectByPrimaryKey(Integer tsFurnitureId);

    int updateByExampleSelective(@Param("record") TeamshoppingFurniture record, @Param("example") TeamshoppingFurnitureExample example);

    int updateByExample(@Param("record") TeamshoppingFurniture record, @Param("example") TeamshoppingFurnitureExample example);

    int updateByPrimaryKeySelective(TeamshoppingFurniture record);

    int updateByPrimaryKey(TeamshoppingFurniture record);
}