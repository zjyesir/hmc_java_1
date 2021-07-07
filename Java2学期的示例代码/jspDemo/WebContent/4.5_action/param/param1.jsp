<%-- 
    Document   : param1
    Created on : 2017-11-11, 15:58:39
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
    <P>加载文件效果：</P>
        <jsp:include page="add.jsp">
            <jsp:param name="start" value="99" />
            <jsp:param name="end" value="100" />
        </jsp:include>
</BODY>
</HTML>
