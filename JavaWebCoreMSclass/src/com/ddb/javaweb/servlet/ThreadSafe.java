package com.ddb.javaweb.servlet;
//解决线程安全问题：增加synchrinized关键字让方法同步
//解决方法有两种 1.增加synchronized关键字让方法同步
//            2.用局部变量代替实例变量 是两者没有关系 调用一次结束一次
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name="";//实例变量，多线程共享
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreadSafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
  
		response.setContentType("text/html,charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		// request.setCharacterEncoding("UTF-8");
		 PrintWriter out=response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>线程安全问题</title></head>");
	    out.println("<body>");
	    String userName=request.getParameter("username");
	   String   name=new String(userName.getBytes("ISO8859-1"),"UTF-8" );
	  
	    try {
			Thread.sleep(3000);//休眠3秒
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    out.println("<h3> 你好："+name+"<h3>");
	    out.println("</body>");
	    out.println("</thml>");
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
