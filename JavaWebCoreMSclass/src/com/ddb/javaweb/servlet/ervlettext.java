package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class ervlettext extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
          throws ServletException,IOException{
	  PrintWriter out=resp.getWriter();
    	out.println("<HTML>");
    	out.println("<head><tile>servlet</title></head>");
    	out.println("<BODY>");
    	out.println("<h3>Hello World!</h3>");
    	out.println("<h3>时间："+new Date()+"</h3>");
    	out.println("</BODY>");
    	out.println("</HTML>");
    	out.close();
    	
	
    }	
}
