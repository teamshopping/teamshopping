package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingCar;
import com.neusoft.bean.TeamshoppingCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingCarMapper {
    int countByExample(TeamshoppingCarExample example);

    int deleteByExample(TeamshoppingCarExample example);

    int deleteByPrimaryKey(Integer tsCarId);

    int insert(TeamshoppingCar record);

    int insertSelective(TeamshoppingCar record);

    List<TeamshoppingCar> selectByExample(TeamshoppingCarExample example);

    TeamshoppingCar selectByPrimaryKey(Integer tsCarId);

    int updateByExampleSelective(@Param("record") TeamshoppingCar record, @Param("example") TeamshoppingCarExample example);

    int updateByExample(@Param("record") TeamshoppingCar record, @Param("example") TeamshoppingCarExample example);

    int updateByPrimaryKeySelective(TeamshoppingCar record);

    int updateByPrimaryKey(TeamshoppingCar record);
}