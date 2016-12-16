package com.ddb.javaweb.mytext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Threadsafe
 */
@WebServlet("/Threadsafe1")
public class Threadsafe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String name="";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Threadsafe1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  //	response.getWriter().append("Served at: ").append(request.getContextPath());
       response.setContentType("text/html,charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
    //  request.setCharacterEncoding("UTF-8");
       PrintWriter out=response.getWriter();
	   String name1=request.getParameter("username");
	 //  name=new String( name1.getBytes("ISO8859-1"), "UTF-8");
	   String   name=new String(name1.getBytes("ISO8859-1"),"UTF-8" );
	   out.println("<html>");
	  out.println("<head><title>servlet多线程安全验证</title></head>");
	  out.println("<body>");
	  try {
		  Thread.sleep(4000);//休眠秒
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
	  
	  out.println("<h3>你好 ："+name+"</h3>");
	  out.println("</body>");
	  out.println("</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
