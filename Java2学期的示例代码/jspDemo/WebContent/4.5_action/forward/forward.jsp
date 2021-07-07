<%-- 
    Document   : forward
    Created on : 2017-11-11, 15:47:55
    Author     : hyl
--%>

<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
    <HEAD>
        <TITLE>forward</TITLE>
    </HEAD>
    <BODY>
        <P>
            当前推荐图书清单:
            <% double i = Math.random();
                if (i > 0.5) {
            %>
            <jsp:forward page="catalog1.html"/>
            <%
            } else {
            %>
            <jsp:forward page="catalog2.html"/>
            <%
                }
            %>
    </BODY>
</HTML>
