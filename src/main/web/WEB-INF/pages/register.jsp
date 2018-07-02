<%--
  Created by IntelliJ IDEA.
  User: dongfucai
  Date: 2018/4/15
  Time: 下午9:46
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path=request.getContextPath();
%>



<!DOCTYPE html>
<html>

<script src="http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.js"></script>
<link href="http://cdn.jsdelivr.net/timepicker.js/latest/timepicker.min.css" rel="stylesheet"/>

<div>
    <input type="text" id="time" placeholder="Time">
</div>


<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8">--%>
    <meta http-equiv="Content-Type" content="application/json">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js">
        </script>
    <title></title>
</head>
<body>



<h1>注册</h1>
<form id="loginForm"  action="<%=path%>/register" method="post">
    用户名：<input type="text" name="loginName"/><br>
    密  码：<input type="date" name="password"/><br>
    密  码:<input type="date"   name="password2"/> <br>
    <input type="submit" value="注册"/>
    <input type="date"   name="por"/>
    <input type="time"   name="pt"/>


</form>


<script>
    document.write("<h1>This is a heading</h1>");
    document.write("<p>This is a paragraph.</p>");
</script>


<script type="text/javascript">
    $(document).ready(function(){
        var saveDataAry=[];
        var data1={"userName":"test","address":"gz"};
        var data2={"userName":"ququ","address":"gr"};
        saveDataAry.push(data1);
        saveDataAry.push(data2);
        $.ajax({
            type:"POST",
            url:"saveUser",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify(saveDataAry),
            success:function(data){

            }
        });
    });
</script>

</body>
</html>