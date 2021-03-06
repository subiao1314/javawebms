package com.sub.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginReceive")
public class LoginReceive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginReceive() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html,charset=UTF-8"); // 设置字符编码方式
		// request.setCharacterEncoding("UTF-8"); //使用了EncodingFilter所以不需要单独设置请求参数的字符集了
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter(); // 设置输出流
		String userName = request.getParameter("username"); // 获取实例化请求参数
		String passWord = request.getParameter("password"); // 获取实例化请求参数
		if ("jiliu".equals(userName) && "yongjin".equals(passWord)) { // 设置userName为“jiliu(激流)”
																		// 密码为“yongjin(勇进)”
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/LoginSystem/LoginSuccess.jsp");
			rd.forward(request, response);
			// 如果账号密码正确，跳转到登录页面

		} else {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/LoginSystem/LoginFalsed.jsp");
			rd.forward(request, response);
			// 否则跳转到登录失败页面
		}

	}

}
