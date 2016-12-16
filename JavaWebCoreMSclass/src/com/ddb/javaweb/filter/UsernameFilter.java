package com.ddb.javaweb.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class UsernameFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/servlet/Login" })
public class UsernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UsernameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("usernameFilter  销毁中...");
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		System.out.println("usernameFilter  运行中...");
		String username=request.getParameter("userName");
		if ("".equals(username)||null==username) {
          HttpServletResponse response2=(HttpServletResponse) response;
          response2.sendRedirect("/JavaWebCoreMSclass/JavaWebCore1/filter/usernameFalsed.html");
		} else {
			/*HttpServletResponse response2=(HttpServletResponse) response;
			response2.sendRedirect("Login");*/
			chain.doFilter(request, response);
         
		}
/*		
		chain.doFilter(request, response);*/
		
	}

	private FilterConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("usernameFilter  初始化...");
	  
	}

}
