<%-- 
    Document   : expression
    Created on : 2017-11-11, 15:31:35
    Author     : hyl
--%>
<%@ page language="java" pageEncoding="GB2312" %>
<%@ page contentType="text/html;charset=gb2312" %> 
<!DOCTYPE HTML PUBLIC "－//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>JSP表达式</title>
</head>
<body bgcolor="#FFFFFF">
<!-- 客户端可以通过查看源码看到的注释 -->
<% for(int i=1;i<=5;i++){%>
<H<%=i%>>
你好
</H<%=i%>>
<BR>
<%}%>
<%-- 客户端通过查看源码看不到的注释 --%>
</body>
</html>

