<%-- 
    Document   : sum
    Created on : 2017-11-11, 16:19:15
    Author     : hyl
--%>

<HTML>
<%@ page contentType="text/html;charset=GB2312" %>
<BODY ><Font size=5 >
 <% long sum=0;
    String s1=request.getParameter("sum");
    String s2=request.getParameter("n");
     if(s1==null)
       {s1="";}
     if(s2==null)
       {s2="0";}
    if(s1.equals("1"))
       {int n=Integer.parseInt(s2);
         for(int i=1;i<=n;i++)
            {sum=sum+i;
            } 
       }
      else if(s1.equals("2"))
       {int n=Integer.parseInt(s2);
         for(int i=1;i<=n;i++)
            {sum=sum+i*i;
            } 
       }
      else if(s1.equals("3"))
       {int n=Integer.parseInt(s2);
         for(int i=1;i<=n;i++)
            {sum=sum+i*i*i;
            } 
       }
 %>
<P>您的求和结果是<%=sum%>
</FONT>
</BODY>
</HTML>
