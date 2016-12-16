package com.ddb.javaweb.mytext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login1", urlPatterns = { "/Login1" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>登录界面</title></head>");
		out.println("<body>");
		out.println("<form action=\""+request.getContextPath()+"/LoginReceived\" method=\"post\">");
		out.println("<h3>用户名：<input type=\"text\" name=\"username\" /></h3>");
		out.println("<h3>密&nbsp;码：<input type=\"passward\" name=\"passward\" /></h3>");
		out.println("<span><input type=\"submit\" nvalue=\"登录\" /></span>");
		out.println("<span><input type=\"reset\" nvalue=\"重置\" /></span>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
