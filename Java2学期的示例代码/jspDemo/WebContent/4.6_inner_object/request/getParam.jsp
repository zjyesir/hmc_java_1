<%-- 
    Document   : getParam
    Created on : 2017-11-11, 16:13:12
    Author     : hyl
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<HTML>
  <BODY>
    你好,
  <%! String Name;%>  
  <%
    request.setCharacterEncoding("UTF-8");
    Name=request.getParameter("UserName");
    String stars=new String("你喜欢吃的水果有：");
    String[] paramValues = request.getParameterValues("checkbox1");
		for(int i=0;i<paramValues.length;i++)stars+=paramValues[i]+"  ";
  %>
  <%=Name%>
  <br>
  <%=stars%>
   </BODY>
</HTML>
