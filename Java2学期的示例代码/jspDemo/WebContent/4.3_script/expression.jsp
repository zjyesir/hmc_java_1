<%-- 
    Document   : expression
    Created on : 2017-11-11, 15:31:35
    Author     : hyl
--%>
<%@ page language="java" pageEncoding="GB2312" %>
<%@ page contentType="text/html;charset=gb2312" %> 
<!DOCTYPE HTML PUBLIC "��//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>JSP���ʽ</title>
</head>
<body bgcolor="#FFFFFF">
<!-- �ͻ��˿���ͨ���鿴Դ�뿴����ע�� -->
<% for(int i=1;i<=5;i++){%>
<H<%=i%>>
���
</H<%=i%>>
<BR>
<%}%>
<%-- �ͻ���ͨ���鿴Դ�뿴������ע�� --%>
</body>
</html>

