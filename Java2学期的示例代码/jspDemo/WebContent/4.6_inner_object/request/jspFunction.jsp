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
<BR>�ͻ�ʹ�õ�Э����:
   <% String protocol=request.getProtocol();
      out.println(protocol);
   %>
<BR>��ȡ���ܿͻ��ύ��Ϣ��ҳ�棺
   <% String path=request.getServletPath();
      out.println(path);
   %>
<BR>���ܿͻ��ύ��Ϣ�ĳ��ȣ�
   <% int length=request.getContentLength();
      out.println(length);
   %>
<BR>�ͻ��ύ��Ϣ�ķ�ʽ��
   <% String method=request.getMethod();
      out.println(method);
   %>
<BR>��ȡHTTPͷ�ļ���User��Agent��ֵ����
   <% String header1=request.getHeader("User��Agent");
      out.println(header1);
   %>
<BR>��ȡHTTPͷ�ļ���accept��ֵ��
   <% String header2=request.getHeader("accept");
      out.println(header2);
   %>
<BR>��ȡHTTPͷ�ļ���Host��ֵ��
   <% String header3=request.getHeader("Host");
      out.println(header3);
   %>
<BR>��ȡHTTPͷ�ļ���accept��encoding��ֵ��
   <% String header4=request.getHeader("accept��encoding");
      out.println(header4);
   %>
<BR>��ȡ�ͻ���IP��ַ��
   <% String  IP=request.getRemoteAddr();
      out.println(IP);
   %>
<BR>��ȡ�ͻ��˵����ƣ�
   <% String clientName=request.getRemoteHost();
      out.println(clientName);
   %> 
<BR>��ȡ�����������ƣ�
   <% String serverName=request.getServerName();
      out.println(serverName);
   %> 
<BR>��ȡ�������Ķ˿ںţ�
   <% int serverPort=request.getServerPort();
      out.println(serverPort);
   %> 
<BR>��ȡ�ͻ����ύ�����в��������֣�
   <% Enumeration enum1=request.getParameterNames();
       while(enum1.hasMoreElements())
            {String s=(String)enum1.nextElement();
             out.println(s);
            }      
      %> 
<BR>��ȡͷ���ֵ�һ��ö�٣�
   <% Enumeration enum_headed=request.getHeaderNames();
      while(enum_headed.hasMoreElements())
            {String s=(String)enum_headed.nextElement();
             out.println(s);
            }      
   %>
<BR>��ȡͷ�ļ���ָ��ͷ���ֵ�ȫ��ֵ��һ��ö�٣�
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
