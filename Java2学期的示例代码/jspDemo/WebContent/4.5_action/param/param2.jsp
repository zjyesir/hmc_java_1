<%-- 
    Document   : param2
    Created on : 2017-11-11, 16:02:30
    Author     : hyl
--%>
<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<title>向jsp:forward传递参数示例：</title>
<BODY>
<P>向jsp:forward传递参数示例：
<jsp:forward page="welcome.jsp">
     <jsp:param name="name" value="John" />
    </jsp:forward>
</BODY>
</HTML>
