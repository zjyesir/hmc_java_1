<%-- 
    Document   : testError
    Created on : 2012-3-10, 16:49:54
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE HTML PUBLIC "－//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>页面错误属性测试</title>
</head>
<body bgcolor="#FFFFFF">
<%!int[] a={1,2,3};%>
<%=a[3]%>
</body>
</html> 

