package com.ddb.javaweb.mytext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.model.core.EnumConstant;

/**
 * Servlet implementation class OutputInfo
 */
@WebServlet("/OutputInfo")
public class OutputInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputInfo() {
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
	    PrintWriter out=response.getWriter();
	    out.println("<html>");
	    out.println("<head><title></title></head>");
	    out.println("<body>");
        Enumeration headrs=request.getHeaderNames();
        while (headrs.hasMoreElements()) {
			String  name = (String ) headrs.nextElement();
            //String name2 = new String( name.getBytes("ISO-8859-1"), "UTF-8");
		String name2 = new String( name.getBytes("ISO-8859-1"), "UTF-8");
            
            String value=request.getHeader(name);
			out.println("<h3>"+name+" : "+value+"</h3>");
			
		}
      //  response.setStatus(1, "http://www.baidu.com");
     //   response.sendRedirect("http://www.baidu.com");
	    out.println("<>");
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
