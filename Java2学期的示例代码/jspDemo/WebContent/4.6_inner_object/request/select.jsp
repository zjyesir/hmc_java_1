<%-- 
    Document   : select
    Created on : 2017-11-11, 16:18:34
    Author     : hyl
--%>

<HTML>
<%@ page contentType="text/html;charset=GB2312" %>
<BODY ><Font size=5 >


   <FORM action="sum.jsp" method=post name=form>
      <P>ѡ����㷽ʽ <Select name="sum" size=2>
          <Option Selected value="1">����1��n��������
          <Option value="2">����1��n��ƽ����
          <Option value="3">����1��n��������
       </Select> 
 <P>ѡ��n��ֵ��
       <Select name="n" >
          <Option value="10">n=10
          <Option value="20">n=20
          <Option value="30">n=30
          <Option value="40">n=40
          <Option value="50">n=50
          <Option value="100">n=100
       </Select> 
        <BR><BR>
     <INPUT TYPE="submit" value="�ύ" name="submit">
   </FORM> 
</FONT>
</BODY>
</HTML>
