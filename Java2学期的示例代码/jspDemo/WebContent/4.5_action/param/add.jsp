<%-- 
    Document   : add
    Created on : 2017-11-11, 16:00:19
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
    <%  String start=request.getParameter("start"); //��ȡֵ��
         String end=request.getParameter("end"); //��ȡֵ��
int s=Integer.parseInt(start);
int e=Integer.parseInt(end);
         int sum=0;
         for(int i=s;i<=e;i++)
            { sum=sum+i;
            }
    %>
<P>
   ��<%=start%>��<%=end%>���������ǣ�
<BR>
  <%=sum%>
</BODY>
</HTML>

