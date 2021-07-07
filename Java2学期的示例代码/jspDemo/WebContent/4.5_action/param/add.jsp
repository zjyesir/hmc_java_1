<%-- 
    Document   : add
    Created on : 2017-11-11, 16:00:19
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
    <%  String start=request.getParameter("start"); //获取值。
         String end=request.getParameter("end"); //获取值。
int s=Integer.parseInt(start);
int e=Integer.parseInt(end);
         int sum=0;
         for(int i=s;i<=e;i++)
            { sum=sum+i;
            }
    %>
<P>
   从<%=start%>到<%=end%>的连续和是：
<BR>
  <%=sum%>
</BODY>
</HTML>

