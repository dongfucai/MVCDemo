<%--
  Created by IntelliJ IDEA.
  User: dongfucai
  Date: 2018/4/15
  Time: 下午10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath()	;
    System.out.println(path);
    response.sendRedirect(path+"/gotoregister");
%>

