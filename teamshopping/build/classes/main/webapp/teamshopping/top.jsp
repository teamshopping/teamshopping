<%@page import="com.neusoft.pojo.UserMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/style.css" />
<title>引用头部</title>
</head>
<body>
<%
	UserMember usermember = (UserMember)session.getAttribute("usermember");
%>
<%
	if(usermember!=null){%>
	<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.jpg" /></div>
	<div class="help"><span>欢迎:<%{usermember.getuMemberName();} %></span><a href="#" class="shopping">购物车</a><a href="../usermember/personal.jsp">个人信息查看</a></div>
	</div>
		
	<%}else{%>
	<div id="header" class="wrap">
	<div id="logo"><img src="images/logo.jpg" /></div>
	<div class="help"><span>请登录:</span><a href="../usermember/login.html">登录</a><a href="../usermember/register.html">注册</a></div>
</div>
		
	<%}%>
</body>
</html>