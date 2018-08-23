<%@page import="com.neusoft.pojo.UserMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>个人信息</title>
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/personal.css">
	<script src="js/jquery-3.3.1.js"></script>
  	<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<%
	UserMember usermember=(UserMember)session.getAttribute("usermember");
%>
<body>
<div class="content">
	<div class="left-ul">
		<ul class="nav nav-pills nav-stacked left-li">
		<li class="active"><a href="personal.jsp">基本信息</a></li>
		<li><a href="#">我的订单</a></li>
		<li><a href="#">绑定信息</a></li>
		<li><a href="address.jsp">配送地址</a></li>
		</ul>
	</div>
	<div class="right-div">
		
<div class="table-responsive">
<form action="" method="get">
  <table class="table">
    <thead>
      <tr>
        <th>基本信息</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td>昵称</td>
        <td><input type="text" name="name" value="<%=usermember.getuMemberName()%>"/></td>
       </tr> 
       <tr>
        <td>真是姓名</td>
        <td><input type="text" name="reale" value="<%=usermember.getuMemberReale()%>"/></td>
       </tr> 
      <tr>
        <td>性别</td>
        <td>
        <input type="radio" name="sex" value="0">男
		<input type="radio" name="sex" value="1">女
		</td>
      </tr>
      <tr>
        <td><input type="submit" value="确定修改"/></td>
      </tr>
    </tbody>
  </table>
  </form>
</div>
</div>
</div>
</body>
<script type="text/javascript">
 if(<%=usermember.getuMemberSex()%>==1){
	  $("input[type='radio']:eq(1)").attr("checked","checked");
   }else{
	  $("input[type='radio']:eq(0)").attr("checked","checked");
  }

$(function(){
	$(".left-ul > ul > li").removeClass("active");
	$(".left-ul > ul > li:eq(0)").addClass("active");
});
</script>
</html>