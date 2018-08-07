package com.neusoft.dao;

import com.neusoft.bean.UserPrize;
import com.neusoft.bean.UserPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPrizeMapper {
    int countByExample(UserPrizeExample example);

    int deleteByExample(UserPrizeExample example);

    int deleteByPrimaryKey(Integer sPrizeId);

    int insert(UserPrize record);

    int insertSelective(UserPrize record);

    List<UserPrize> selectByExample(UserPrizeExample example);

    UserPrize selectByPrimaryKey(Integer sPrizeId);

    int updateByExampleSelective(@Param("record") UserPrize record, @Param("example") UserPrizeExample example);

    int updateByExample(@Param("record") UserPrize record, @Param("example") UserPrizeExample example);

    int updateByPrimaryKeySelective(UserPrize record);

    int updateByPrimaryKey(UserPrize record);
}