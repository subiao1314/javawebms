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
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, 
		description = "Login使用UTF-8的字符编码方式", 
		urlPatterns = { 
				"/EncodingFilter", 
				"/servlet/Login"
		}, 
		initParams = { 
				@WebInitParam(name = "charset", value = "UTF-8", description = "是指其参数为UTF-8编码方式")
		})
public class EncodingFilter implements Filter {
         private String charset; //创建私有变量
    /**
     * Default constructor. 
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("EncodingFilter  销毁中...");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
   
		System.out.println("EncodingFilter  运行前...");
		 request.setCharacterEncoding(this.charset);
	 	chain.doFilter(request, response);
	 	System.out.println("EncodingFilter  运行后...");

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	     charset=fConfig.getInitParameter("charset");
		System.out.println("EncodingFilter  初始化... 参数为："+charset);
	
	
	}

}
