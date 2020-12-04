# Eclipse + tomcat 学习j2ee的常见问题



### 环境搭配

1. 如果之前安装的不是专门的j2ee，而是普通的for java developer,那需要安装 j2ee插件，从eclipse中的help ->install new ...进去，具体参照下面的文章

https://blog.csdn.net/twilight_shaw/article/details/90383432

https://blog.csdn.net/faye_1008/article/details/89529328

2. 如果网速慢，直接安装一个 eclipse for j2ee





**下面这个链接是 菜鸟教材中 Eclipse JSP/Servlet 环境搭建，很清晰。将eclipse 和Tomact连接配置，jsp如何运行起来(一些入门的步骤是直接在网页上点击运行，其实是可以在eclipse编辑运行)。同时也把我下面遇到的问题也提到了。可以参照这个进行从头配置**

**https://www.runoob.com/jsp/eclipse-jsp.html**



### 遇到的问题

1. https://www.cnblogs.com/pskcoco/p/12047065.html

   如果在eclipse里面 一个jsp页面上 run on server这样去启动以后的Tomact，那么如果你之前通过命令行 ./start.sh启动的tomacat，两者会冲突。所以，我先用./shutdown.sh去关闭，然后再在eclipse里面启动。两者貌似不能共存 上面这个问题，其实菜鸟教材中已经提到过了。

2. 乱码问题 https://jingyan.baidu.com/article/870c6fc325a691b03fe4beac.html 

   粒度不一样，可以是一个文件夹，也可以是一个文件这样去设置 ，都是右击，然后属性，然后resources. 里面有encodeing.  

   **<u>技巧</u>**：首先Windows->Preferences, 然后选择General下面的Workspace. Text file encoding选择Other GBK， **<u>如果没有GBK的选项， 没关系， 直接输入GBK三个字母， Apply，</u>** GBK编码的中文， 已经不是乱码了

3. html型的缩进：https://blog.csdn.net/weixin_42092787/article/details/100971995

4.  连接jdbc的时候遇到 “java.lang.ClassNotFoundException: com.mysql.jdbc.Driver”，但是又是找遍了网上的资料，基本上都说是三个问题：
     一是：连接URL格式出现了问题(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/XX","root","XXXX")
     二是：驱动字符串出错(com.mysql.jdbc.Driver)
     三是Classpath中没有加入合适的mysql_jdbc驱动
     经过我的仔细检查，这三种错误我都没有犯，为什么呢？
     ~~尝试着将mysql-connector-java-3.1.14-bin.jar的jar包加入C:\Program Files\Java\jre1.6.0_02\lib\ext文件夹下，问题解决了！！~~

     ~~原来是不仅仅要求将驱动加入classpath中，而且需要将该jar包加入到java运行环境的外部jar包中，唉，下次这种低级错误还是少犯为妙。~~ 删除线中，我是用另一种方法替换了：把connector-java... jar加入到tomcat的lib里面 

   https://blog.csdn.net/huangbiao86/article/details/6428608?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.nonecase

### eclipse和mysql连接 jdbc

参考下面：https://www.jianshu.com/p/3cae846b8a91

1. 安装好mysql

2. 安装一个编辑mysql数据库的gui，比如MySql workBench ，（tablePlus可以作为辅助验证，虽然推荐，但功能还没有完全弄懂，还是以workBench为例子）

   1. 创建schema
   2. 创建table
   3. 给这个table赋值，也就是每一行具体的数值

3. 安装驱动包，把.jar文件添加到项目的build path->Libraries->add External JARs(ClassPath)

4. 测试代码

   ```java
   public static void main(String[] args) {
   		 try 
   	        {  
   	              Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序      
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
   	                  "jdbc:mysql://127.0.0.1:3306/mySql","root","hangyi123456");  
   	                   //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码  
   	          
   	               System.out.println("Success connect Mysql server!");  
   	              
   	               Statement stmt = connect.createStatement();  
   	               
   //	               ResultSet rs = stmt.executeQuery("select * from database.db");  
   	               ResultSet rs = stmt.executeQuery("select * from work1.tableOne");  
   	                                                                      //user 为你表的名称  
   	               while (rs.next()) 
   	               {  
   	                   
   	                   String uid = rs.getString("id");
   	                   String name = rs.getString("name");
   	                   String password = rs.getString("password");
   	                   
   	                   System.out.println("学号:" + uid +""
   	                        + "\t" + "姓名:" + name + "\t" + "年龄:"+ password + "\n" );
   	               }   
   	               rs.close(); 
   	               connect.close(); // 关闭连接  
   	         }  
   	         catch (Exception e) 
   	         {  
   	              System.out.print("get data error!");  
   	              e.printStackTrace();  
   	          }  
   	    }  
   	
   ```

   

注意的，Mysql workBench添加后的数据，可以在tablePlus这编辑器也能看到，只不过在workBench里面添加的是schema 但在tablePlus里面显示的是database

