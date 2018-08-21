package com.neusoft.service.impl;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.UserMemberMapper;
import com.neusoft.pojo.UserMember;
import com.neusoft.service.UserMemberService;

@Service("userMemberService")
public class UserMemberServiceimpl implements UserMemberService{
	@Autowired
	private UserMemberMapper userMemberMapper;

	/**
	 * 添加usermember用户
	 * 返回0或1
	 */
	public int addUserMember(UserMember userMember) {
		return 0;
	}
	/**
	 * 根据id查询usermember
	 * 返回usermember对象
	 */
	public UserMember getUserMemberById(Integer id) {
		UserMember userMember=userMemberMapper.getUserMemberById(id);
		return userMember;
	}
	/**
	 * 检查用户名是否存在
	 */
	public UserMember getUserMemberByName(String name) {
		UserMember userMember=userMemberMapper.getUserMemberByName(name);
		return userMember;
	}
	/**
	 * 修改密码
	 */
	public int updateMemberPass(Map<String, String> list) {
		int rs=userMemberMapper.updateMemberPass(list);
		return rs;
	}
	/**
	 * 登录
	 */
	public UserMember getUserMember(UserMember userMember) {
			String pwd =userMember.getuMemberPwd();
		try {
			userMember.setuMemberPwd(this.getPwd(pwd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userMemberMapper.getUserMember(userMember);
	}
	
	
	
	/**
	 * md5加密
	 * @throws NoSuchAlgorithmException 
	 */
	public String getPwd(String pwd ) throws Exception{
			MessageDigest md =MessageDigest.getInstance("MD5");
			byte[] digest=md.digest(pwd.getBytes());
			String newPwd=new String(digest);
			return newPwd;
			
	}
	
	

}
