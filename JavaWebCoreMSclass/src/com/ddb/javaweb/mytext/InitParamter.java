package com.ddb.javaweb.mytext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamter
 */
//@WebServlet("/InitParamter")
public class InitParamter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    private String myins=null;
	    private String mymajor=null;
	    private String mcount=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParamter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	      //依次获取三个初始化参数的值，处理后存放到类的三个私有字段中
	      myins=config.getInitParameter("ins");
	      if (myins==null) 
			myins="";
	      mymajor=config.getInitParameter("major");
	      if (myins==null) 
	    	  mymajor="";
	      mcount=config.getInitParameter("count");
	         try {
				int count = Integer.parseInt(mcount);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	      response.setCharacterEncoding("text/html;charset=utf-8");
	      request.setCharacterEncoding("utf-8");
	      PrintWriter out=response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>获取初始化参数</title></head>");
	      out.println("<body>");
	      out.println("<h2>所在学院："+myins+"</h2>");
	      out.println("<h2>所在专业："+mymajor+"</h2>");
	      out.println("<h2>此servlet的访问次数：："+mcount+"</h2>");
	      out.println("</body>");
	      out.println("<html>");
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
