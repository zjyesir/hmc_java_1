<%-- 
    Document   : safe
    Created on : 2017-11-11, 15:41:18
    Author     : hyl
--%>
<%@ page contentType="text/html;charset=GB2312" %>
<%@ page isThreadSafe ="false" %>
<HTML>
<BODY>
    <%! int number=0;     
     void countPeople()
        { 
       int i =0;	
	   double sum = 0.0;		
	   while (i++ < 200000000) {	
			sum += i;		
	}		
        number++;
        }
    %>
    <% countPeople();  //�ڳ���Ƭ�е��÷�����
    %>
<P>���ǵ�   <%=number%>�����ʱ�վ�Ŀͻ���
</BODY>
</HTML>
