package com.ddb.javaweb.mytext;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletRedirectDemo
 */
@WebServlet("/ServletRedirectDemo")
public class ServletRedirectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRedirectDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html,charset=UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    
	    request.setAttribute("location", "杜少");
		HttpSession session=request.getSession();
		session.setAttribute("name", "苏标");
	    ServletContext context=getServletConfig().getServletContext();
	    context.setAttribute("age", "24");
	  RequestDispatcher rd=context.getRequestDispatcher("/JavaWebCore1/servlet/get_info.jsp");
	  //      RequestDispatcher rd=context.getRequestDispatcher("/http://www.baidu.com");
	  //inclue inford()方法只能访问内部文件 不可访问外网
	   //必须加“/”
	   rd.include(request, response);
	  // rd.forward(request, response);
	 //   RequestDispatcher rd1=request.getRequestDispatcher("/JavaWebCore1/servlet/get_info.jsp");
	    //加不加“/”都行
	      //RequestDispatcher方法中，不用再加request.getContextPath()，系统默认获取 服务器端跳转 
	   // rd1.forward(request, response);
      //	    rd1.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
