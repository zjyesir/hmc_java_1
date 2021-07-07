<%-- 
    Document   : counter
    Created on : 2017-11-11, 20:03:51
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=gb2312"%>
<!DOCTYPE HTML PUBLIC "－//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title>网页计数器</title>
</head>
<body>
<%  if (application.getAttribute("counter")==null)
	application.setAttribute("counter","1");
	else{
		String times=null;
		times=application.getAttribute("counter").toString();
		int icount=0;
		icount=Integer.valueOf(times).intValue();
		icount++;
		application.setAttribute("counter",Integer.toString(icount));
		}  %>
您是第<%=application.getAttribute("counter")%>位访问者！
</body>
</html>
