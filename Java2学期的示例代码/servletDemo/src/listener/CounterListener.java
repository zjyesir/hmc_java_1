/*
 * CounterListener.java
 *
 * Created on 2007骞?10鏈?19鏃?, 涓嬪崍4:15
 */

package listener;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class CounterListener implements ServletContextListener {
    
     String path="";
     @Override
    public void contextInitialized(ServletContextEvent evt) {
         
		CounterFile f = new CounterFile();
		String name = evt.getServletContext().getInitParameter("CounterPath");
		path = evt.getServletContext().getRealPath(name);
		try {
			String temp = f.ReadFile(path);
			System.out.println(temp);
			evt.getServletContext().setAttribute("Counter", temp);// 将计数器的值放入应用上下文
			System.out.println("contextInitialized........");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
         
    }
     @Override
    public void contextDestroyed(ServletContextEvent evt) {
         try{
         String  current= (String)evt.getServletContext().getAttribute("Counter");
         CounterFile f=new CounterFile();
         f.WriteFile(path,current);
          System.out.println("contextDestroyed........");
         }catch(Exception e){
             System.out.println(e.toString());
         }
    }
}
