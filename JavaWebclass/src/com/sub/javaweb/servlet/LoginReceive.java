package com.sub.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginReceive
 */
@WebServlet(description = "这是登录接收界面，接收来自于webcent/servlet里的登录信息",
      urlPatterns = { "/LoginReceive" })
public class LoginReceive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginReceive() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
       doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String now = (String) new Date().toLocaleString();
		response.setContentType("text/html,charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>这是接收登录信息界面 </title></head>");
		out.println("<body>");
		String username = request.getParameter("userName");
		if ("".equals(username) || null == username)
			username = "未输入";
		// 如果没有用户名，则复制“未输入”
		String password = request.getParameter("passWord");
		if ("".equals(password) || null == password)
			password = "未输入";

		out.println("<h2>用户登录信息为 " + now + "</h2>");
		out.println("<h3>会员名：" + username + "</h3>");
		out.println("<h3>密&nbsp;码：" + password + "</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
