package com.neusoft.dao;

import com.neusoft.bean.UserLuckdraw;
import com.neusoft.bean.UserLuckdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLuckdrawMapper {
    int countByExample(UserLuckdrawExample example);

    int deleteByExample(UserLuckdrawExample example);

    int deleteByPrimaryKey(Integer uLuckdrawId);

    int insert(UserLuckdraw record);

    int insertSelective(UserLuckdraw record);

    List<UserLuckdraw> selectByExample(UserLuckdrawExample example);

    UserLuckdraw selectByPrimaryKey(Integer uLuckdrawId);

    int updateByExampleSelective(@Param("record") UserLuckdraw record, @Param("example") UserLuckdrawExample example);

    int updateByExample(@Param("record") UserLuckdraw record, @Param("example") UserLuckdrawExample example);

    int updateByPrimaryKeySelective(UserLuckdraw record);

    int updateByPrimaryKey(UserLuckdraw record);
}