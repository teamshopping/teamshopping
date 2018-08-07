package com.neusoft.dao;

import com.neusoft.bean.Journalism;
import com.neusoft.bean.JournalismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JournalismMapper {
    int countByExample(JournalismExample example);

    int deleteByExample(JournalismExample example);

    int deleteByPrimaryKey(Integer journalismId);

    int insert(Journalism record);

    int insertSelective(Journalism record);

    List<Journalism> selectByExampleWithBLOBs(JournalismExample example);

    List<Journalism> selectByExample(JournalismExample example);

    Journalism selectByPrimaryKey(Integer journalismId);

    int updateByExampleSelective(@Param("record") Journalism record, @Param("example") JournalismExample example);

    int updateByExampleWithBLOBs(@Param("record") Journalism record, @Param("example") JournalismExample example);

    int updateByExample(@Param("record") Journalism record, @Param("example") JournalismExample example);

    int updateByPrimaryKeySelective(Journalism record);

    int updateByPrimaryKeyWithBLOBs(Journalism record);

    int updateByPrimaryKey(Journalism record);
}