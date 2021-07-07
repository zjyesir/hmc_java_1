<%-- 
    Document   : greeting
    Created on : 2017-11-11, 19:43:12
    Author     : hyl
--%>

<%@ page language="java" %>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "?//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>Lomboz JSP</title>
</head>
<body bgcolor="#FFFFFF">
<%
Date today =new Date();

int h= today.getHours();
if(h<12)response.sendRedirect("morning.jsp");
else response.sendRedirect("afternoon.jsp");
%>
</body>
</html>
