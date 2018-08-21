package com.neuspft.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��¼������
 * */
public class LoginInterceptor implements HandlerInterceptor {


	//�÷������������������֮��Ҳ������DisppatcherServlet��Ⱦ�˶�Ӧ����ͼ֮��ִ�С�
	//���������Ҫ�����ڽ�����Դ������
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	 

	}
	
    //Controller��������֮��ִ�С�
	//DisppatcherServlet������ͼ������Ⱦ֮ǰ�����ã�
	//�������ǿ�������������ж�Controller����֮���ModelAndView������в���
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	 

	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
  
		HttpSession session = arg0.getSession();
		
		if (session.getAttribute("user") == null) {
			arg1.sendRedirect("../usermember/login.jsp");
			return false;
		}
		return true;
	}


}
