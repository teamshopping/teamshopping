<%@page import="com.neusoft.pojo.TeamshoppingBuyCar"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>个人信息</title>
	<link href="<%=request.getContextPath()%>/usermember/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/usermember/css/personal.css">
	<script type="text/javascript"  language="javascript" src="<%=request.getContextPath()%>/usermember/js/jquery-3.3.1.js"></script>
  	<script src="<%=request.getContextPath()%>/usermember/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="content">
<div class="right-div">
<div class="table-responsive">
  <table class="table">
    <thead>
      <tr>
        <th>购物车</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="key" items="${list}" varStatus="id">
    	<tr>
        <td style="height: 110px;">
        	<span>商品：${key.commodity} --- 数量：${key.number} --- 单价:${key.price}</span>
        	<span style="margin-left:30px;"><a href="">修改</a><a href="" style="margin-left:10px;">删除</a></span>
        </td>
      </tr>
    </c:forEach>
      
      <tr>
        <td colspan="2" style="height: 110px;">
       		<span></span><a href="addAddress.jsp">提交订单</a> 
        </td>
       </tr> 
       
      
    </tbody>
  </table>
</div>
</div>
</div>
</body>
</html>