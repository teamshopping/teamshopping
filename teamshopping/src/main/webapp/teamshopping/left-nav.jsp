<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>左边导航</title>
<script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<div class="lefter">
		<div class="box">
			<h2>电子分类</h2>
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
</body>
<script type="text/javascript">
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
</script>
</html>