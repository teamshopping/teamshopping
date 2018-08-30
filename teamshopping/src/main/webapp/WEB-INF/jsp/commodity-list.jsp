<%@page import="com.neusoft.pojo.TeamshoppingGoods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>易买网 - 首页</title>
<link href="<%=request.getContextPath()%>/teamshopping/css/style.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript"  language="javascript" src="<%=request.getContextPath()%>/teamshopping/js/jquery-3.3.1.js"></script>
</head>
<body>
<div id="header" class="wrap">
</div>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			
		</ul>
	</div>
</div>
<div id="main" class="wrap">
	<div class="lefter">
		<div class="box">
			<h2>商品分类</h2>
			<dl>
				<dd><a href=""></a></dd>
				<dd><a href=""></a></dd>
				<dd><a href=""></a></dd>
				<dd><a href=""></a></dd>
				<dd><a href=""></a></dd>
				<dd><a href=""></a></dd>
			</dl>
		</div>
		<div class="spacer"></div>
		
	</div>
	<div class="main">
		<div class="product-list">
			<h2>笔记本</h2>
			<div class="clear"></div>
			<ul class="product clearfix">
				<c:forEach var="key" items="${pager.list}" varStatus="id">
    			<li>
        			<dl>
        				<dt><a href="product-view.html" target="_blank"><img src="${key.picture }" /></a></dt>
						<dd class="title"><a href="product-view.html" target="_blank">${key.introduce }</a></dd>
						<dd class="price">${key.money }</dd>
        			</dl>
      			</li>
    			</c:forEach>
				
			</ul>
			<div class="clear"></div>
			<div class="pager">
				<ul class="clearfix">
					<c:forEach begin="1" end="${pager.pageCount }" varStatus="obj">
	 					<li><a href="${pageContext.request.contextPath }/shopping/type/${pager.pageSize }/${obj.index }?type=${pager.list[0].type}">${obj.index }</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 团购网站 All Rights Reserved.
</div>
</body>
<script type="text/javascript">
$(function() {
  //$.ajax({
	// url:"http://localhost:8080/teamshopping/shopping/type",
	//dataType:"json",
	//success:function(data){
	//	$(".main img").each(function(i){
	//   		this.src = data[i].picture;
	// 	});
	//	$(".title a").each(function(i){
	//		this.text = data[i].introduce;
	//	});
	//	$(".price span").each(function(i){
	//		$(".price span:eq("+i+")").text(data[i].money);
	//	});
	//}
// });
	$.ajax({
		url:"http://localhost:8080/teamshopping/commodity/alltype",
		dataType:"json",
		success:function(data){
			$(".box a").each(function(i){
				this.href = "http://localhost:8080/teamshopping/left/ul/"+data[i].id;
		   		this.text = data[i].typename;
		 	});
		}
	});
});  
</script>
</html>
