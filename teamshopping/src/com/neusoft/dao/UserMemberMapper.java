package com.neusoft.dao;

import com.neusoft.bean.UserMember;
import com.neusoft.bean.UserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMemberMapper {
    int countByExample(UserMemberExample example);

    int deleteByExample(UserMemberExample example);

    int deleteByPrimaryKey(Integer uMemberId);

    int insert(UserMember record);

    int insertSelective(UserMember record);

    List<UserMember> selectByExampleWithBLOBs(UserMemberExample example);

    List<UserMember> selectByExample(UserMemberExample example);

    UserMember selectByPrimaryKey(Integer uMemberId);

    int updateByExampleSelective(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByExample(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByPrimaryKeySelective(UserMember record);

    int updateByPrimaryKeyWithBLOBs(UserMember record);

    int updateByPrimaryKey(UserMember record);
}