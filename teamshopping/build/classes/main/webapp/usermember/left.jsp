<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="left-ul">
		<ul class="nav nav-pills nav-stacked left-li">
		<li class="active"><a href="personal.jsp">基本信息</a></li>
		<li><a href="#">我的订单</a></li>
		<li><a href="#">绑定信息</a></li>
		<li><a href="address.jsp">配送地址</a></li>
		</ul>
	</div>
</body>
<script type="text/javascript">
	
	$(".left-ul > ul > li:eq(0)").click(function(){
		$(".left-ul > ul > li").removeClass("active");
		$(".left-ul > ul > li:eq(0)").addClass("active");
	});
	$(".left-ul > ul > li:eq(1)").click(function(){
		$(".left-ul > ul > li").removeClass("active");
		$(".left-ul > ul > li:eq(1)").addClass("active");
	});
	$(".left-ul > ul > li:eq(2)").click(function(){
		$(".left-ul > ul > li").removeClass("active");
		$(".left-ul > ul > li:eq(2)").addClass("active");
	});
	$(".left-ul > ul > li:eq(3)").click(function(){
		$(".left-ul > ul > li").removeClass("active");
		$(".left-ul > ul > li:eq(3)").addClass("active");
	});
</script>
</html>