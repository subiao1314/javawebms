package com.ddb.javaweb.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PasswordFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, description = "验证是否填写密码", urlPatterns = { "/servlet/Login" })
public class PasswordFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PasswordFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("passwordFilter  销毁中...");
	
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		System.out.println("passwordFilter  运行中...");
		 String password=request.getParameter("passWord"); 
		if (null==password||"".equals(password)) {
         			HttpServletResponse response2=(HttpServletResponse)response; 
         			//filter中调用调用httpservlter 需要向下转型
         			HttpServletRequest request2=(HttpServletRequest)request;
         			
         		//	response2.sendRedirect(request2.getContextPath()+"/JavaWebCore1/filter/passwordFalsed.html");
         		//	response2.sendRedirect("/JavaWebCoreMSclass/JavaWebCore1/filter/passwordFalsed.html");
         			response2.sendRedirect("../JavaWebCore1/filter/passwordFalsed.html");
		} else {

			chain.doFilter(request, response);
		}      //条件成功，就返回执行该文件下面的内容 相当于放行
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("passwordFilter  初始化...");
	
	}

}
