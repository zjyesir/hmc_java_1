<%-- 
    Document   : plugin
    Created on : 2017-11-11, 16:06:41
    Author     : hyl
--%>

<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
  <jsp:plugin type="applet" code="Circle.class" codebase="src/jsp" >  
     <jsp:fallback>
        Plugin tag OBJECT or EMBED not supported by browser. 
     </jsp:fallback>
</jsp:plugin>
</body>
</html>
