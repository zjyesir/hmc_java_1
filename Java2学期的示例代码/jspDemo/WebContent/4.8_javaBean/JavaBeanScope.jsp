<%-- 
    Document   : JavaBeanScope
    Created on : 2017-11-11, 21:57:16
    Author     : hyl
--%>
<%@ page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "－//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>JavaBean Test</title>
</head>
<body bgcolor="#FFFFFF">
<jsp:useBean id="student3"  scope="session" class="com.jsp.Student" />
<%=student3.getName()%>
<%student3.setName("temp");%>
</body>
</html>

