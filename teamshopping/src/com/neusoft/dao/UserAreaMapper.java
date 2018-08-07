package com.neusoft.dao;

import com.neusoft.bean.UserArea;
import com.neusoft.bean.UserAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAreaMapper {
    int countByExample(UserAreaExample example);

    int deleteByExample(UserAreaExample example);

    int deleteByPrimaryKey(Integer uAreaId);

    int insert(UserArea record);

    int insertSelective(UserArea record);

    List<UserArea> selectByExample(UserAreaExample example);

    UserArea selectByPrimaryKey(Integer uAreaId);

    int updateByExampleSelective(@Param("record") UserArea record, @Param("example") UserAreaExample example);

    int updateByExample(@Param("record") UserArea record, @Param("example") UserAreaExample example);

    int updateByPrimaryKeySelective(UserArea record);

    int updateByPrimaryKey(UserArea record);
}