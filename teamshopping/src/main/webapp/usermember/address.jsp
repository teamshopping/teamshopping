<%@page import="java.util.ArrayList"%>
<%@page import="com.neusoft.pojo.UserMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>个人信息</title>
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/personal.css">
	<script src="js/jquery-3.3.1.js"></script>
  	<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
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
  <table class="table">
    <thead>
      <tr>
        <th>基本信息</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="key" items="${usermember.getAddress()}" varStatus="id">
    	<tr>
        <td style="height: 110px;">
        	<span>${key.getuAddressProvince()} ${key.getuAddressCity()} ${key.getuAddressArea()} ${key.getuAddressDetailed()}</span>
        	<span style="margin-left:30px;"><a href="">修改</a><a href="" style="margin-left:10px;">删除</a></span>
        </td>
      </tr>
    </c:forEach>
      
      <tr>
        <td colspan="2" style="height: 110px;">
       		<span></span><a href="">新增地址</a> 
        </td>
       </tr> 
       
      
    </tbody>
  </table>
</div>
</div>
</div>
</body>
<script type="text/javascript">
$(function(){
	$(".left-ul > ul > li").removeClass("active");
	$(".left-ul > ul > li:eq(3)").addClass("active");
});
</script>
</html>