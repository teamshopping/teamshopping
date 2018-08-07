package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingComputer;
import com.neusoft.bean.TeamshoppingComputerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingComputerMapper {
    int countByExample(TeamshoppingComputerExample example);

    int deleteByExample(TeamshoppingComputerExample example);

    int deleteByPrimaryKey(Integer tsComputerId);

    int insert(TeamshoppingComputer record);

    int insertSelective(TeamshoppingComputer record);

    List<TeamshoppingComputer> selectByExample(TeamshoppingComputerExample example);

    TeamshoppingComputer selectByPrimaryKey(Integer tsComputerId);

    int updateByExampleSelective(@Param("record") TeamshoppingComputer record, @Param("example") TeamshoppingComputerExample example);

    int updateByExample(@Param("record") TeamshoppingComputer record, @Param("example") TeamshoppingComputerExample example);

    int updateByPrimaryKeySelective(TeamshoppingComputer record);

    int updateByPrimaryKey(TeamshoppingComputer record);
}