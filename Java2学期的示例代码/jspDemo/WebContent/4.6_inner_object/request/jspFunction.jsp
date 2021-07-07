<%-- 
    Document   : jspFunction
    Created on : 2017-11-11, 16:10:24
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="java.util.*" %>
<HTML>
<BODY >
<Font size=5>   
<BR>客户使用的协议是:
   <% String protocol=request.getProtocol();
      out.println(protocol);
   %>
<BR>获取接受客户提交信息的页面：
   <% String path=request.getServletPath();
      out.println(path);
   %>
<BR>接受客户提交信息的长度：
   <% int length=request.getContentLength();
      out.println(length);
   %>
<BR>客户提交信息的方式：
   <% String method=request.getMethod();
      out.println(method);
   %>
<BR>获取HTTP头文件中User－Agent的值：：
   <% String header1=request.getHeader("User－Agent");
      out.println(header1);
   %>
<BR>获取HTTP头文件中accept的值：
   <% String header2=request.getHeader("accept");
      out.println(header2);
   %>
<BR>获取HTTP头文件中Host的值：
   <% String header3=request.getHeader("Host");
      out.println(header3);
   %>
<BR>获取HTTP头文件中accept－encoding的值：
   <% String header4=request.getHeader("accept－encoding");
      out.println(header4);
   %>
<BR>获取客户的IP地址：
   <% String  IP=request.getRemoteAddr();
      out.println(IP);
   %>
<BR>获取客户端的名称：
   <% String clientName=request.getRemoteHost();
      out.println(clientName);
   %> 
<BR>获取服务器的名称：
   <% String serverName=request.getServerName();
      out.println(serverName);
   %> 
<BR>获取服务器的端口号：
   <% int serverPort=request.getServerPort();
      out.println(serverPort);
   %> 
<BR>获取客户端提交的所有参数的名字：
   <% Enumeration enum1=request.getParameterNames();
       while(enum1.hasMoreElements())
            {String s=(String)enum1.nextElement();
             out.println(s);
            }      
      %> 
<BR>获取头名字的一个枚举：
   <% Enumeration enum_headed=request.getHeaderNames();
      while(enum_headed.hasMoreElements())
            {String s=(String)enum_headed.nextElement();
             out.println(s);
            }      
   %>
<BR>获取头文件中指定头名字的全部值的一个枚举：
   <% Enumeration enum_headedValues=request.getHeaders("cookie");
      while(enum_headedValues.hasMoreElements())
            {String s=(String)enum_headedValues.nextElement();
             out.println(s);
            }      
   %>
<BR>
</Font>
</BODY>
</HTML>
