package com.neusoft.dao;

import com.neusoft.bean.TeamshoppingBooks;
import com.neusoft.bean.TeamshoppingBooksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamshoppingBooksMapper {
    int countByExample(TeamshoppingBooksExample example);

    int deleteByExample(TeamshoppingBooksExample example);

    int deleteByPrimaryKey(Integer tsBooksId);

    int insert(TeamshoppingBooks record);

    int insertSelective(TeamshoppingBooks record);

    List<TeamshoppingBooks> selectByExample(TeamshoppingBooksExample example);

    TeamshoppingBooks selectByPrimaryKey(Integer tsBooksId);

    int updateByExampleSelective(@Param("record") TeamshoppingBooks record, @Param("example") TeamshoppingBooksExample example);

    int updateByExample(@Param("record") TeamshoppingBooks record, @Param("example") TeamshoppingBooksExample example);

    int updateByPrimaryKeySelective(TeamshoppingBooks record);

    int updateByPrimaryKey(TeamshoppingBooks record);
}