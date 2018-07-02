<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>

			<h1>登陆页面</h1>
			<form id="loginForm"  action="<%=path%>/login" method="post">
				用户名：<input type="datetime-local" name="loginName"/><br>
				 密码：<input type="datetime" name="password"/><br>
				<input type="submit" value="登陆"/>
			</form>
</body>
</html>