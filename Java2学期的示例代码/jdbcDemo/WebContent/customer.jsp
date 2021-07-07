<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<% 
java.sql.Connection conn=null; 
java.lang.String strConn; 
java.sql.Statement sqlStmt=null; //语句对象 
java.sql.ResultSet sqlRst=null; //结果集对象 
try{
//conn=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?useUnicode=true&amp;characterEncoding=utf-8","root","mysql"); 
conn=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306","root","hangyi123456"); 

sqlStmt=conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);
//执行Sql语句 
//String sqlQuery="select customerid,address,phone from customer";
String sqlQuery="SELECT  * FROM work1.Employees where last=\"Ye\"";
sqlRst=sqlStmt.executeQuery (sqlQuery); 
%>
<center>个人信息表</center>
<table border="1" width="100%" bordercolorlight="#CC99FF" cellpadding="2" bordercolordark="#FFFFFF" cellspacing="0"> 
<tr> 
  <td align="center">序号</td> 
  <td align="center">年龄</td> 
  <td align="center">名</td> 
  <td align="center">姓</td> 
</tr> 
<% while (sqlRst.next()) { //取得下一条记录 %> 
<tr><!--显示记录--> 
  <td><%=sqlRst.getString("id")%></td> 
  <td><%=new String(sqlRst.getString("age"))%></td> 
  <td><%=sqlRst.getString("first")%></td>
  <td><%=sqlRst.getString("last")%></td>
 </tr> 
<% } %> 
</table> 
<%
 } catch (java.sql.SQLException e){
out.println(e.toString());
}finally{
    //关闭结果集对象 
  if(sqlRst!=null)sqlRst.close(); 
  //关闭语句对象 
  if(sqlStmt!=null)sqlStmt.close (); 
  //关闭数据库连接 
  if(conn!=null)conn.close(); 
}
%>  

