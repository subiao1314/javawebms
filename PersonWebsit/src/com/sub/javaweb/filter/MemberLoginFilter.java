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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class MemberLoginFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
	, description = "此过滤器主要是检查会员登陆信息是否为空，"
			+ "若为空这跳转重新登陆，否者进入下一页面"
			, urlPatterns = { "/servlet/MemberPage.jsp"}
			     )
public class MemberLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MemberLoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MemberLoginFilter 运行中...");
        //设置输出是为了在控制台检测是否执行该步骤
        HttpServletRequest request2=(HttpServletRequest)request;
        HttpSession session=request2.getSession();
        HttpServletResponse response2=(HttpServletResponse)response;
          String userid2=(String) session.getAttribute("userid");
        if (null==userid2||"".equals(userid2)) {
            response2.sendRedirect("/PersonWebsit/servlet/UnLogin.jsp");	
		    //如果没有获取userid 跳转到失败页面
		} else {
			//如果获取了userid 跳转到会员页面
			chain.doFilter(request, response);
           
		}
        
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
       
	}

}
