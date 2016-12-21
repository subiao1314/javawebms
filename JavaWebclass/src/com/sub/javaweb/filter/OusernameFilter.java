package com.sub.javaweb.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PasswoedFilter
 */
@WebFilter(
		   filterName="f01",
		dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, description = "拦截验证是否输入用户名", urlPatterns = { "/LoginReceive" })
public class OusernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public OusernameFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    String username=request.getParameter("userName");
	    if ("".equals(username)||null==username) {
			HttpServletResponse response2=(HttpServletResponse)response;
			response2.sendRedirect("/JavaWebclass/filter/NoUsername.jsp");
      }else{
			
			chain.doFilter(request, response);
			
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
