<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增地址</title>
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
<form action="" method="get">
  <table class="table">
    <thead>
      <tr>
        <th>新增地址</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td>省市区</td>
        <td>
        <select class="select" id="select01">
			 <option>---请选择---</option>
		</select>
		<select class="select" id="select02">
		</select>
		<select class="select" id="select03">
		</select>
        </td>
       </tr> 
       <tr>
        <td>详细地址</td>
        <td>
        <input type="text" id="detailed" />
        <input type="hidden" name="mid" value="${usermember.getuMemberId()}" >
        </td>
       </tr> 
      <tr>
        <td><input type="submit" value="提交添加"/></td>
      </tr>
    </tbody>
  </table>
  </form>
</div>
</div>
</div>
</body>
<script type="text/javascript">

$(function() {
	init();
	$("#btn").click(function(){
	var province=$("#select01 option:selected").text();
	var city=$("#select02 option:selected").text();
	var area=$("#select03 option:selected").text();
	var detailed=$("#detailed").val();
	$.ajax({
		url:"http://localhost:8080/teamshopping/memter/addaddress",
		data:{"province":province,"city":city,"area":area,"detailed":detailed},
		datatype:"json",
		success: function(data){
			if(data.status=="true"){
				alert(data.msg);
				window.location="http://localhost:8080/teamshopping/usermember/address.jsp"
			}else{
				alert(data.msg);
			}
			
		}

	});
	
});
});

	
function init() {
		$.ajax({
			url: "http://127.0.0.1:8080/teamshopping/memter/getaddress",
			dataType:"json",
			success: function(data){
				//初始化标签
				function Init(node) {
			        return node.html("<option>---请选择---</option>");
			        }
				//省
			    $.each(data.province, function (i,j) {
			        $("#select01").append("<option" + " value='"+j.uProvinceId+"'>" + j.uProvinceName + "</option>");
			     });
			  //一级变动
			    $("#select01").change(function () {
			    	//清空二三级
			        Init($("#select02"));
			        Init($("#select03"));
			        //二三级联动
			    	$.each(data.city,function (i,j) {
			            if ($("#select01 option:selected").val() == j.uCityPid) {
			                //$.each(data.city, function (m,n) {
			                $("#select02").append("<option" + " value='"+j.uCityId+"'>" + j.uCityName + "</option>");
			                   // });
			                  
			    		$("#select02").change(function () {
			    			Init($("#select03"));
			                $.each(data.area, function (m,n) {
			                    if ($("#select02 option:selected").val() == n.uAreaCid) {
			                        //$.each(data.area, function (z,y) {
			                        $("#select03").append("<option" + " value='"+n.uAreaId+"'>" + n.uAreaName + "</option>");
			                        	//});
			                         }
			                       });
			                    }); 
			    		}	

			    	});

				});
			 }

		});
	}
</script>
</html>