package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnectionTest {

	public MysqlConnectionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 try 
	        {  
//	              Class.forName("com.mysql.jdbc.Driver");     //鍔犺浇MYSQL JDBC椹卞姩绋嬪簭      
	              Class.forName("com.mysql.cj.jdbc.Driver");     //鍔犺浇MYSQL JDBC椹卞姩绋嬪簭,杩欎釜鏄柊璇硶   
	             System.out.println("Success loading Mysql Driver!");  
	         }  
	         catch (Exception e) 
	        {  
	              System.out.print("Error loading Mysql Driver!");  
	              e.printStackTrace();  
	        }  
	        try 
	        {  
	               System.out.println("start connecting");
	                Connection connect = DriverManager.getConnection(  
//	                  "jdbc:mysql://127.0.0.1:3306/","root","hangyi123456");  
	                "jdbc:mysql://localhost:3306/","root","hangyi123456");  
	                   //杩炴帴URL涓�   jdbc:mysql//鏈嶅姟鍣ㄥ湴鍧�/鏁版嵁搴撳悕  锛屽悗闈㈢殑2涓弬鏁板垎鍒槸鐧婚檰鐢ㄦ埛鍚嶅拰瀵嗙爜  
//	                鍏跺疄杩欓噷鐨勬暟鎹簱鍙互涓嶅啓锛屼絾鍓嶆彁鏄悗闈� select from 鍚庨潰鐨勮〃鏍艰鍐欏叏 鏁版嵁搴�.琛ㄥ悕銆�
	          
	               System.out.println("Success connect Mysql server!");  
	              
	               Statement stmt = connect.createStatement();  
	               
//	               ResultSet rs = stmt.executeQuery("select * from database.db");  
	               ResultSet rs = stmt.executeQuery("select * from work1.tableOne");  
//	              // x.y  x涓簊hema鍚嶅瓧锛寉涓簍able鍚� sql.yesir_table_1鏄敤tablePlus鍒涘缓鐨�
//	               鑰� work1.tableOne鏄敤work bench鍒涘缓鐨勶紝鎸夐亾鐞嗘病鍖哄埆鐨勶紝浣嗕簨瀹炪�傘�傘��
//	               ResultSet rs = stmt.executeQuery("select * from mysql.yesir_table_1");
//	               濡傛灉鎸夌収杩欎箞鍐欙紝涓嶅啓鏁版嵁搴撳悕瀛楋紝鍙啓琛ㄥ悕锛岄偅涔堜笂闈㈢殑url閲岄潰瑕佸啓鏁版嵁搴撳悕瀛楋紝鍥犱负mysql閲岄潰鏈夊涓暟鎹簱锛屾瘡涓暟鎹簱鏈夊涓〃
//	               瀵圭収鍏崇郴杩欐牱鐨勶紝鍦ㄨ繛鎺ョ殑鏃跺�欙紝搴旇浼氬幓閬嶅巻鎵�鏈夌殑琛紝鏄惁瀛樺湪銆�
//	               ResultSet rs = stmt.executeQuery("select * from yesir_table_1");  
	                                                                      
	               while (rs.next()) 
	               {  
	                   
	                   String uid = rs.getString("id");
	                   String name = rs.getString("name");
	                   String password = rs.getString("password");
	                   
	                   System.out.println("id:" + uid +""
	                        + "\t" + "姓名:" + name + "\t" + "密码:"+ password + "\n" );
	               }   
	               rs.close(); 
	               connect.close(); // 鍏抽棴杩炴帴  
	         }  
	         catch (Exception e) 
	         {  
	              System.out.print("get data error!");  
	              e.printStackTrace();  
	          }  
	    }  
	
}
