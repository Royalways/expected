<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 
response.setHeader("Cache-Control","no-store"); 
response.setHeader("Pragrma","no-cache"); 
response.setDateHeader("Expires",0); 
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script>
$(document).ready(function() {
	//单击验证
	$("#butn").click(function() {
		var username = $("#login-name").val();
		var psw = $("#login-pass").val();
		console.log(username);
		console.log(psw);
		var json = {"userName": username,"password": psw};
			$.ajax({
				dataType: "json",
				contentType:"application/json;charset=UTF-8",
				traditional:true,//这使json格式的字符不会被转码
				url:  "UserLogin",
				type: "post",				
				data: JSON.stringify(json),
				cache: false,
				error: function (jqXHR, textStatus, errorThrown) {
		            alert("bad request!");
		        },
			    success: function(data) {
			    	$("#nameMessage").html("");
			    	$("#passwordMessage").html("");
			    	var xmlhttp = new XMLHttpRequest();
			    	if(data.result=="0")
				    	$("#nameMessage").html("Error");
			    	else{
			    		location.href='home';
			    	}
			    }
			});
		});
});
</script>

</head>
<body>
<center>
	<input type="text" class="login-field" value="" placeholder="用户账户" id="login-name"><span id="nameMessage"></span><br/>
	<input type="password" class="login-field" value="" placeholder="用户密码" id="login-pass"><span id="passwordMessage"></span><br/>
	<input type="button" id="butn" value="登录" class="btn btn-primary btn-large btn-block">	
</body>
</html>