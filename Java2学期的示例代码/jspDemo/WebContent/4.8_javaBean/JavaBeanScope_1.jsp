<%@ page language="java" %>
<!DOCTYPE HTML PUBLIC "?//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>JavaBean Test</title>
</head>
<body bgcolor="#FFFFFF">
<jsp:useBean id="student3" scope="session" class="com.jsp.Student" />
<%=student3.getName()%>
<%student3.setName("temp");%>
</body>
</html>
