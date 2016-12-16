package com.ddb.javaweb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Simplefilter
 */
@WebFilter("/Simplefilter22")
public class Simplefilter implements Filter {

    /**
     * Default constructor. 
     */
    public Simplefilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	//	System.out.println("这是 Simplefilter destory() 销毁中...");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain

		System.out.println("这是 Simplefilter doFilter() 调用chain之前...");
		chain.doFilter(request, response);
		System.out.println("这是 Simplefilter doFilter() 调用chain之后...");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
       /*   String name1=fConfig.getInitParameter("name");
          System.out.println("这是 Simplefilter init() 初始化... 参数为："+name1);*/
	
	}

}
