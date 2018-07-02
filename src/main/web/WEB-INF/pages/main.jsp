<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>OA系统</title>
</head>
<body>

			<h1>${loginFlag}</h1>

			<a href="http://localhost:8080/gotoregister">
				<button>请注册</button>
			</a>

			<a href="http://localhost:8080/gotoLogin">
				<button color="bule">请登陆</button>
			</a>

</body>
</html>