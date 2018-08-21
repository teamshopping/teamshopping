package com.neuspft.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录拦截类
 * */
public class LoginInterceptor implements HandlerInterceptor {


	//该方法将在整个请求结束之后，也就是在DisppatcherServlet渲染了对应的视图之后执行。
	//这个方法主要是用于进行资源清理工作
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	 

	}
	
    //Controller方法调用之后执行、
	//DisppatcherServlet进行视图返回渲染之前被调用，
	//所以我们可以在这个方法中对Controller处理之后的ModelAndView对象进行操作
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
