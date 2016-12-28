package com.sub.javaweb.listener;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Application Lifecycle Listener implementation class UserOnlineList
 *
 */
@WebListener
public class UserOnlineList implements ServletContextListener, HttpSessionAttributeListener, HttpSessionListener {
        private ServletContext app=null;
   
    public UserOnlineList() {
    }

	



    public void sessionDestroyed(HttpSessionEvent arg0)  { 

    	Set all=(Set) this.app.getAttribute("online");
    	all.add(arg0.getSession().getAttribute("userod"));
    	this.app.setAttribute("online",all);
    }




    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	Set all=(Set) this.app.getAttribute("online");
        all.remove(arg0.getValue());
        this.app.setAttribute("online",all);
    }


	
    public void contextInitialized(ServletContextEvent arg0)  { 
      this.app=arg0.getServletContext();  
      this.app.setAttribute("online", new TreeSet());
    }





	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
		
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
}
