package com.neusoft.dao;

import com.neusoft.bean.Worknumber;
import com.neusoft.bean.WorknumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorknumberMapper {
    int countByExample(WorknumberExample example);

    int deleteByExample(WorknumberExample example);

    int deleteByPrimaryKey(Integer worknumberId);

    int insert(Worknumber record);

    int insertSelective(Worknumber record);

    List<Worknumber> selectByExample(WorknumberExample example);

    Worknumber selectByPrimaryKey(Integer worknumberId);

    int updateByExampleSelective(@Param("record") Worknumber record, @Param("example") WorknumberExample example);

    int updateByExample(@Param("record") Worknumber record, @Param("example") WorknumberExample example);

    int updateByPrimaryKeySelective(Worknumber record);

    int updateByPrimaryKey(Worknumber record);
}