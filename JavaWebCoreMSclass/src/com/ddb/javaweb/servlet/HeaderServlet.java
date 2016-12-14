package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
		String strDate=dateFormat.format(new Date());
	    out.println("<table><tr>  ");
	    out.println("<td width=200><font size=3 color='#990000'>"+strDate+"</font></td>");
	    out.println("<td width=200><font size=5 color='#990000'><center>ABC有限责任公司</center></font></td> ");
	    out.println("<marquee><font size=3 color='#990000'>Seconds seles of export quality"
	    		+ " Germents at Rockford Hall,ne Delhi.</font></marquee> ");
	    out.println("<hr>");
	    out.println("</tr></table>");
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
