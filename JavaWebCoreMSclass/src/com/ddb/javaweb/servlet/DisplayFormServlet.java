package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayFormServlet
 */
@WebServlet("/display")
public class DisplayFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    //获取三种不同对象传递的值
		String str=(String)request.getAttribute("fromRequest");
	     HttpSession session=request.getSession();
	     String str2=(String)session.getAttribute("fromSession");
	     ServletContext context=getServletConfig().getServletContext();
	     String str3=(String)context.getAttribute("fromContext");
	     
         response.setContentType("text/html;charset=UTF-8");
         response.setCharacterEncoding("UTF-8");
         PrintWriter out=response.getWriter();
         out.println("<html>");
         out.println("<head><title>输出范围属性有关信息</title></html>");
         out.println("<body>");
         out.println("<h3>request值："+str+" </h3>");
         out.println("<h3>session值："+str2+" </h3>");
         out.println("<h3>application值："+str3+" </h3>");
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
