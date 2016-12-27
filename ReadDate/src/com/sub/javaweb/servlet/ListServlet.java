package com.sub.javaweb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sub.javaweb.javabean.User;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")

  //使用集合存储用户信息，遍历显示到jsp中

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<User> list=new ArrayList<>();  
	
	
    
    public ListServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");		 
        String  name=request.getParameter("name");		
        String  clas=request.getParameter("clas");		
        String  course=request.getParameter("course");		
        String   score=request.getParameter("score");		
	
        User user=new User(name, clas, course, score);
        list.add(user);
       ServletContext application =this.getServletContext();		
		application.setAttribute("list",list);
        response.sendRedirect("page/homePage.jsp");		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
