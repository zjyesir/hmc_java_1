<%-- 
    Document   : select
    Created on : 2017-11-11, 16:18:34
    Author     : hyl
--%>

<HTML>
<%@ page contentType="text/html;charset=GB2312" %>
<BODY ><Font size=5 >


   <FORM action="sum.jsp" method=post name=form>
      <P>选择计算方式 <Select name="sum" size=2>
          <Option Selected value="1">计算1到n的连续和
          <Option value="2">计算1到n的平方和
          <Option value="3">计算1到n的立方和
       </Select> 
 <P>选择n的值：
       <Select name="n" >
          <Option value="10">n=10
          <Option value="20">n=20
          <Option value="30">n=30
          <Option value="40">n=40
          <Option value="50">n=50
          <Option value="100">n=100
       </Select> 
        <BR><BR>
     <INPUT TYPE="submit" value="提交" name="submit">
   </FORM> 
</FONT>
</BODY>
</HTML>
