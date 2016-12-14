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
 * Servlet implementation class ABCHomePage
 */
@WebServlet("/ABCHomePage")
public class ABCHomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABCHomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   //	response.getWriter().append("Served at: ").append(request.getContextPath());
	    
		response.setContentType("text/html;charset=UTF-8");
		//response.setCharacterEncoding("UTF-8");
		//request.setCharacterEncoding("UTF-8");
	    PrintWriter out=response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>ABC公司主页</title></head>");
	    out.println("<body>");
	    ServletContext context=getServletContext();
	    RequestDispatcher rd=context.getRequestDispatcher("/HeaderServlet");
        rd.include(request, response);
      //  rd.forward(request,response);
        
	    
        out.println("<font size=4 color='#000099'>");
        out.println("&nbsp;&nbsp;ABC Limited founded in 1890 is a multinational compamy spread across six nations.<br><br>");
        out.println("we deal with garment export and online sales of designer wares.<br><br> ");
        out.println("To have a look at our fascinating collection check out at "	
        + "<a link='www.abcdesign.com'><u>ABC Dsighs</u></a></font><br><br> ");
        
        // rd=forward(request,response);
	    ServletContext context2=getServletContext();
	    RequestDispatcher tf=context2.getRequestDispatcher("/JavaWebCore1/servlet/Footer.html");
	    tf.include(request, response);
	   // tf.forward(request, response);
	    
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

	private RequestDispatcher include(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
