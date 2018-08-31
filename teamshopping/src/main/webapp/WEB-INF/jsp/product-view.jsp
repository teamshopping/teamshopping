<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品</title>
<link href="<%=request.getContextPath()%>/teamshopping/css/style.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript"  language="javascript" src="<%=request.getContextPath()%>/teamshopping/js/jquery-3.3.1.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<jsp:include page="top.jsp"></jsp:include>
</div>
<div id="childNav">
	<div class="wrap">
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
	</div>
	<div id="product" class="main">
		<h1>${goods.introduce }</h1>
		<div class="infos">
			<div class="thumb"><img src="${goods.picture }" /></div>
			<div class="buy">
				<p>商城价：<span class="price">${goods.money }</span></p>
				<p>库　存：${goods.number }</p>
				<p>状    态：${goods.state  }</p>
				数量：<input type="text" name="number"/><input type="hidden" name="userid" value="${usermember.uMemberId }"/>
				<div class="button"><input type="button" name="button" value="购物车" /></div>
			</div>
			<div class="clear"></div>
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
	$("input[name='button']").click(function(){
		var uid=$("input[name='userid']").val();
		var commodity=$("h1").text();
		var price=$("p:eq(0) > span").text();
		var number=$("input[name='number']").val();
		$.ajax({
			url:"http://localhost:8080/teamshopping/buycar/add",
			data:{"commodity":commodity,"price":price,"number":number,"uid":uid},
			contentType:'application/x-www-form-urlencoded; charset=UTF-8',
			success:function(data){
			}
		});
	});
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