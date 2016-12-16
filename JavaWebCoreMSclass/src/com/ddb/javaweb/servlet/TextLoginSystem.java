package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextLoginSystem
 */
@WebServlet("/TextLoginSystem")
public class TextLoginSystem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TextLoginSystem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html,chart=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head><title></title></head>");
        out.println("<body>");
        out.println("<form meath=\"post\" action=\"TestLoginReseve\">");
        out.println("<span>用户名：<input type=\"text\" name=\"username\"></span><br>");
        out.println("<span>密&nbsp码：<input type=\"text\" name=\"username\"></span><br>");
        out.println("<span><input type=\"submit\" name=\"submit\" value=\"登录\"></span>");
        out.println("<span><input type=\"reset\" name=\"reset\" value=\"重置\"></span>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
		
		
		
		
	}

}
