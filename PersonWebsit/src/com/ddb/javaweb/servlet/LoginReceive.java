package com.ddb.javaweb.servlet;

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
 * Servlet implementation class LoginReceive
 */
@WebServlet("/LoginReceive")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // doGet(request, response);
       response.setContentType("text/html,charset=UTF-8"); //设置字符编码方式
       // request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
       PrintWriter out=response.getWriter(); //设置输出流
	  String userName=request.getParameter("username"); //获取实例化请求参数
	  String passWord=request.getParameter("password"); //获取实例化请求参数
	   if ("jiliu".equals(userName)&&"yongjin".equals(passWord)) {  //设置userName为“jiliu(激流)” 密码为“yongjin(勇进)”
		    ServletContext context=getServletContext();
		    RequestDispatcher rd=context.getRequestDispatcher("/LoginSystem/LoginSuccess.html");
		    rd.forward(request, response);
		    //如果账号密码正确，跳转到登录页面
		   
	} else {
          ServletContext context =getServletContext();
          RequestDispatcher rd=context.getRequestDispatcher("/LoginSystem/LoginFalsed.html");
          rd.forward(request, response);
          //否则跳转到登录失败页面
	}
	
	
	
	
	
	}

}
