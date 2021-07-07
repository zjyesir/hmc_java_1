<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="c1" scope  ="application" class ="com.jsp.counter"/>
<jsp:setProperty property="count" name="c1" value="10"/>
<jsp:getProperty property="count" name="c1"/>
<%=c1.getCount() %>

counter c1 = new counter();
c1.setCount(10);
System.out.println(c1.getCounter());

</body>
</html>