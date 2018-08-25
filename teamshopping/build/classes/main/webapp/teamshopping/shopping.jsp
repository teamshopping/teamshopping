<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>团购</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<jsp:include page="top.jsp" flush="true"></jsp:include>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<li class="first"><a href="#">家喻户晓</a></li>
			<li><a href="#">adidas</a></li>
			<li><a href="#">nike耐克</a></li>
			<li><a href="#">花花公子</a></li>
			<li><a href="#">Dell戴尔</a></li>
			<li><a href="#">Asus华硕</a></li>
			<li><a href="#">小米</a></li>
			<li><a href="#">iphone</a></li>
			<li><a href="#">华为</a></li>
			<li><a href="#">凯蒂拉克</a></li>
			<li><a href="#">兰博基尼</a></li>
			<li><a href="#">玛莎拉蒂</a></li>
			<li><a href="#">大众</a></li>
			<li><a href="#">宝马</a></li>
			<li><a href="#">雪佛兰</a></li>
		</ul>
	</div>
</div>
<div id="main" class="wrap">
	<div class="lefter">
		<div class="box">
			<h2>商品分类</h2>
			<dl>
				<dt>百货</dt>
				<dd><a href="list/jacket-list.html">衣服</a></dd>
				<dd><a href="list/trousers-list.html">裤子</a></dd>
				<dd><a href="list/beauty-list.html">美妆</a></dd>
				<dd><a href="list/fresh-list.html">生鲜</a></dd>
				<dd><a href="list/food-list.html">美食</a></dd>
				<dd><a href="list/books-list.html">图书</a></dd>
				<dd><a href="list/musical-list.html">乐器</a></dd>
				<dd><a href="list/furniture-list.html">家具</a></dd>
				<dd><a href="list/phone-list.html">手机</a></dd>
				<dd><a href="list/television-list.html">电视</a></dd>
				<dd><a href="list/computer-list.html">电脑</a></dd>
				<dd><a href="list/glasses-list.html">眼镜</a></dd>
				<dd><a href="list/game-list.html">游戏</a></dd>
				<dd><a href="list/automobile-list.html">汽车</a></dd>
				<dd><a href="list/tourism-list.html">旅游</a></dd>
			</dl>
		</div>
		<div class="spacer"></div>
		
	</div>
<div class="main">
	<div id="shopping">
		<form action="shopping-result.html">
			<table>
				<tr>
					<th>商品名称</th>
					<th>商品价格</th>
					<th>购买数量</th>
					<th>操作</th>
				</tr>
				<tr id="product_id_1">
					<td class="thumb"><img src="images/product/0_tiny.gif" /><a href="product-view.html">铁三角 Audio-Technica ATH-EQ300M-SV 银色 挂耳式耳机</a></td>
					<td class="price" id="price_id_1">
						<span>￥99.00</span>
						<input type="hidden" value="99" />
					</td>
					<td class="number">
						<dl>
							<dt><input id="number_id_1" type="text" name="number" value="1" /></dt>
							<dd onclick="reloadPrice(1,true);">修改</dd>
						</dl>
					</td>
					<td class="delete"><a href="javascript:delShopping(1);">删除</a></td>
				</tr>
			</table>
			<div class="button"><input type="submit" value="" /></div>
		</form>
	</div>
</div>
</div>
<div id="footer">
	Copyright &copy; 团购网站 All Rights Reserved.
</div>
</body>
</html>