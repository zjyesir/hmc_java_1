<%@ page contentType="text/html;charset=gb2312" %> 
<% 
java.sql.Connection conn=null; 
java.lang.String strConn; 
try{
//conn= java.sql.DriverManager.getConnection("jdbc:mysql://localhost/test",/*  */"root","hangyi123456"); 
conn= java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306","root","hangyi123456"); 
%>
连接Mysql数据库成功!

<%

} catch (java.sql.SQLException e){
out.println(e.toString());
}finally{
    if(conn!=null)  conn.close();
}
%>
