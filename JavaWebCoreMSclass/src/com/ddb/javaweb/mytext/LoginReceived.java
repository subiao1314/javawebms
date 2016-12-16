package com.ddb.javaweb.mytext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginReceived
 */
@WebServlet("/LoginReceived")
public class LoginReceived extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginReceived() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html,charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String pwd=request.getParameter("passward");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if ("123".equals(name)&&"123".equals(pwd)) {
			response.sendRedirect("http://www.baidu.com");
			
			//此方法仅用于访问内部的文件！！不可跳转到外网
			/*ServletContext context=getServletContext();
			RequestDispatcher td=context.getRequestDispatcher("/http://www.baidu.com");
			td.forward(request, response);*/
		} else {
			
			response.sendRedirect("http://www.hao123.com");
			/*ServletContext context=getServletContext();
			RequestDispatcher td=context.getRequestDispatcher("/http://www.hao123.com");
			td.forward(request, response);*/
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
	}

}
