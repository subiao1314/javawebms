package com.sub.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet(description = "这是会员登录的接收判断的页面 主要实现接收判断请求资源，"
		+ "并做出相应处理", urlPatterns = { "/MemberLoginServlet" })
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	doGet(request, response);
		
		response.setContentType("text/html,charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
	//	request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>这是接收会员信息登录信息界面 </title></head>");
		out.println("<body>");
		String username = request.getParameter("userName");
		if ("".equals(username) || null == username)
			username = "未输入";
		// 如果没有用户名，则复制“未输入”
		String password = request.getParameter("passWord");
		if ("".equals(password) || null == password)
			password = "未输入";
        
		//判断会员是否为空，若不为空 则给他一个session
		if (!"未输入".equals(username)&&!"未输入".equals(password)) {
			HttpSession session=request.getSession();
			session.setAttribute("userid", username);
			response.sendRedirect("/PersonWebsit/servlet/MemberPage.jsp");
		}else{
			response.sendRedirect("/PersonWebsit/servlet/UnLogin.jsp");
			
		}
		
		
	/*	out.println("<h2>用户登录信息为 </h2>");
		out.println("<h3>会员名：" + username + "</h3>");
		out.println("<h3>密&nbsp;码：" + password + "</h3>");*/
		//可以作为检验接收到的会员名和密码是什么！
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	
	
	}

}
