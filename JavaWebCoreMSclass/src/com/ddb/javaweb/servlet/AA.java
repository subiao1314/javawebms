package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class AA
 */
/*@WebServlet(loadOnStartup=1,
		//  urlPatterns = { "/servlet/AA" }, 
		initParams = { 
				@WebInitParam(name = "AA", value = "安安")
		})*/
public class AA extends HttpServlet {
	private static final long serialVersionUID = 1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	   System.out.println("AA:"+config.getInitParameter("AA"));
	   System.out.println("此servlet的 loadOnStartup=1");
	   System.out.println(config.getInitParameter("name"));
	   System.out.println(config.getInitParameter("address"));
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html,charset=UTF-8");//设置编码方式
		//request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		//PrintWriter out=response.getWriter(); //得到输出字符输出流
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>这是一个servlet文件</title></head>");
		out.println("<body>");
		out.println("<h2>这是一个文门框：</h2>");
		out.println("<h2><input type='text' /></h2>");
		out.println("<h2>现在的时间是："+new Date()+"</h2>");
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
