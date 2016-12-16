package com.ddb.javaweb.mytext;

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
 * Servlet implementation class DisplayServlet1
 */
@WebServlet("/DisplayServlet1")
public class DisplayServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet1() {
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
	    String str1=(String) request.getAttribute("fromrequest");
	    HttpSession session=request.getSession();
	    String str2=(String) session.getAttribute("fromsession");
	    ServletContext context =getServletConfig().getServletContext();
	    String str3=(String)context.getAttribute("fromcontext");
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h3>request的值： "+str1+"</h3>");
	    out.println("<h3>session的值： "+str2+"</h3>");
	    out.println("<h3>context的值： "+str3+"</h3>");
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
