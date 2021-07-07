package listener;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author hyl
 */
@WebListener()
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent evt) {
      
		// 修改在线人数
		String current = (String) evt.getSession().getServletContext().getAttribute("online");
		if (current == null)
			current = "0";
		int c = Integer.parseInt(current);
		c++;
		current = String.valueOf(c);
		evt.getSession().getServletContext().setAttribute("online", current);
		// 修改历史人数
		String his = (String) evt.getSession().getServletContext().getAttribute("Counter");
		if (his == null)
			his = "0";
		int total = Integer.parseInt(his) + 1;
		his = String.valueOf(total);
		evt.getSession().getServletContext().setAttribute("Counter", his);
		System.out.println("sessionCreated.......");
//        System.out.println("sessionCreated.......銆傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘?傘??.");
    }

    /**
     *
     * @param evt
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent evt) {
		System.out.println("sessionDestroyed........");
		// 修改在线人数
		String current = (String) evt.getSession().getServletContext().getAttribute("online");
		if (current == null)
			current = "0";
		int c = Integer.parseInt(current);
		c--;
		current = String.valueOf(c);
		evt.getSession().getServletContext().setAttribute("online", current);
    }

   
}
